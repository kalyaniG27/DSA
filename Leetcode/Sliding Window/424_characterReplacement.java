class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map= new HashMap<>();
        int low=0;
        int res=0;
        int n =s.length();
        int maxFreq =0;
        for(int high=0;high<n;high++){
            map.put(
                s.charAt(high),
                map.getOrDefault(s.charAt(high),0)+1
            );
            int len=high-low+1;
            maxFreq = Math.max(maxFreq, map.get(s.charAt(high)));
            int diff=len-maxFreq;
            while(diff>k){
                char ch=s.charAt(low);
                map.put(ch,map.get(ch)-1);

                if(map.get(ch)==0){
                    map.remove(ch);
                }low++;
            len = high - low + 1;
            diff = len - maxFreq; 

            }
            if(diff<=k){
                res=Math.max(high-low+1,res);
            }


        }
        return res;
    }
}