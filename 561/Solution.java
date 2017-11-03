class Solution {


    public int arrayPairSum(int[] nums) {
        ///////////
        // Sorting 
        ///////////
        Arrays.sort(nums);
        int sumOf = 0;
        for (int j = 0; j < nums.length; j += 2) {
            sumOf += nums[j];
        }

        return sumOf;
    }
}
