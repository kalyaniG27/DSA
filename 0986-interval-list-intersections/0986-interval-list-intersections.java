class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        if (firstList == null || firstList.length == 0 || secondList == null || secondList.length == 0) {
            return new int[0][0];
        }

        List<int[]> res = new ArrayList<>();

        int si = firstList[0][0], ei = firstList[0][1];
        int sj = secondList[0][0], ej = secondList[0][1];

        int i = 0, j = 0;

        while (i < firstList.length && j < secondList.length) {
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
            
            if (sj <= ei) {
                int min = Math.max(si,sj);
                int max = Math.min(ei,ej);
                if (max >= min) {
                    res.add(new int[]{min,max});
                }
            }
            if (i == firstList.length) break;
            if (j == secondList.length) break;
            
            si = firstList[i][0]; ei = firstList[i][1];
            sj = secondList[j][0]; ej = secondList[j][1];
        }
        
        return res.toArray(new int[res.size()][]);
    }
}