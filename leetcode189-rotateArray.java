class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1) {
            return;
        }
        k = k % nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k -1);
        reverseArray(nums, k, nums.length - 1);
        
    }

    private void reverseArray(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}