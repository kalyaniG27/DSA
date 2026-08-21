class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = -1;

            for (int k = 1; k < nums.length; k++){
                int j = (i + k) % nums.length;
                if(nums[j]>nums[i]){
                    res[i] = nums[j];
                    break;
                }else{
                    res[i]=-1;
                }
            }
            
                

                
        
        } return res;
    }
}