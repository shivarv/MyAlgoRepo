class Solution {
    private void reverse(int[] nums, int left , int right) {
        
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {
        int firstNonIncrementingIndex = -1;
        //
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                firstNonIncrementingIndex = i;
                break;
            }
        }

        System.out.println(firstNonIncrementingIndex);
        if(firstNonIncrementingIndex == -1) {
            reverse(nums, 0 , nums.length - 1);
            return;
        }
        for(int i = nums.length - 1;i > firstNonIncrementingIndex; i--) {
            if(nums[i] > nums[firstNonIncrementingIndex]) {
                int temp = nums[i];
                nums[i] = nums[firstNonIncrementingIndex];
                nums[firstNonIncrementingIndex] = temp;
                break;
            }
        }
                System.out.println(Arrays.toString(nums));
                            reverse(nums, firstNonIncrementingIndex + 1, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}