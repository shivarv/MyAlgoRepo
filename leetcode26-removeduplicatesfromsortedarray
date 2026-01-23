class Solution {
    public int removeDuplicates(int[] nums) {
        int outputPointer = 1;
        int counter = 1;
        if(nums.length <= 1) {
            return nums.length;
        }
        //we start with i = 1 and output pointer = 1
        //becz 0'th index value will be right anyways
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[outputPointer++] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}