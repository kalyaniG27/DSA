class Solution {
    public int maxSubArray(int[] nums) {
        int i=nums[0];
        int ans=nums[0];
        int bestindex=0;
        for(i=0;i<nums.length;i++){
            int v1=nums[i];
            int v2=bestindex+nums[i];

            bestindex=Math.max(v1,v2);

            ans=Math.max(bestindex,ans);
        }
        return ans;
        
    }
}