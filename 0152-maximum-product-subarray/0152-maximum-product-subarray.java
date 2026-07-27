class Solution {
    public int maxProduct(int[] nums) {
        int i=0;
        int minend=1;
        int maxend=1;
        int ans=nums[0];
        for(i=0;i<nums.length;i++){
            int v1=nums[i];
            int v2=minend*nums[i];
            int v3=maxend*nums[i];
            minend=Math.min(v1,Math.min(v2,v3));
            maxend=Math.max(v1,Math.max(v2,v3));
            ans=Math.max(ans,Math.max(maxend,minend));

        }
        return ans;
    }
}