/*Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
  */
 
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low=0;
        int high=0;
        int res =Integer.MAX_VALUE;
        int sum=0;
        while(high<n){
            sum=sum+nums[high];

            while(sum>=target){
               int leng= high-low+1;
               res = Math.min(res,leng);
               sum=sum-nums[low];
               low++;
            }
            high++;
           
            
        }return res == Integer.MAX_VALUE ? 0 : res;
    }
    }