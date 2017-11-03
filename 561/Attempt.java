//The one I tried. 
//Failed due to the bubble sort being slow and time limit exceeded.

class Attempt {
    public int arrayPairSum(int[] nums) {
        ///////////
        // Sorting 
        ///////////
        int[] numsCopy = bubbleSort(nums);

        int sumOf = 0;
        for (int j = 0; j < numsCopy.length; j += 2) {
            sumOf += numsCopy[j];
        }

        return sumOf;
    }

    /**
     * Sort using bubblesort
     * @param nums input array
     * @return sorted array
     */
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nums[j] > nums[j+1])
                {
                    // swap temp and arr[i]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
        return nums;
    }
}
