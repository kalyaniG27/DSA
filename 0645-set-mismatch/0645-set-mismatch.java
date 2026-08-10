class Solution {
    public int[] findErrorNums(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int duplicate = 0;

        for (int ele : nums) {
            if (set.contains(ele)) {
                duplicate = ele;
            } else {
                set.add(ele);
            }
        }

        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}


