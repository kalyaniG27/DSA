class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxending=0;
        int minending=0;

        int maxSum=0;
        int minSum=0;
        int res=0;

        for(int i=0;i<nums.length;i++){
            maxending=Math.max(nums[i],maxending+nums[i]);
            maxSum=Math.max(maxSum,maxending);
            minending=Math.min(nums[i],minending+nums[i]);
            minSum=Math.min(minSum,minending);
            res=Math.max(maxSum,Math.abs(minSum));

        }return res;
    }
}