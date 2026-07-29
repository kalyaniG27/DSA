class Solution {
    public int pivotIndex(int[] nums){
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        int suffix = 0;
        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            suffix = totalSum - prefix - nums[i];
            if (suffix == prefix) {
                return i;
            }
            prefix += nums[i];
        }

        return -1;
    }
}