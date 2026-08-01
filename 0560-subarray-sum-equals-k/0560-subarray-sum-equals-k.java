class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<> ();
        int sum=0;
        int res=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            int que=(sum-k);
            int freq = map.getOrDefault(que, 0);
            res +=freq;
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }return res;
    }
}