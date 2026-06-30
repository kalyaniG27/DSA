class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        int low=0;
        int high=0;
        int res =Integer.MAX_VALUE;
        int sum=0;
        while(high<n){
            sum=sum+nums[high];

            while(sum==k){
                int leng = high-low+1;
                res=Math.min(res,leng);
                sum=sum-nums[low];
                low++;
            }
            high++;
        }return res == Integer.MAX_VALUE ? -1 : res;
    }
}