class Solution {
    public boolean increasingTriplet(int[] nums) {
        int minArray[] = new int[nums.length];
        int maxArray[] = new int[nums.length];
        if(nums.length < 3) {
            return false;
        }
        minArray[0] = nums[0];
        maxArray[nums.length -1] = nums[nums.length - 1];
        for(int i = 1; i < nums.length; i++) {
            minArray[i] = Math.min(minArray[i - 1], nums[i]);
        }
        for(int i = nums.length - 2; i >= 1; i--) {
            maxArray[i] = Math.max(maxArray[i + 1], nums[i]);
        }
        System.out.println(Arrays.toString(minArray));
        System.out.println(Arrays.toString(maxArray));
        for(int i = 1; i < nums.length - 1; i++) {
            if(minArray[i - 1] < nums[i] && nums[i] < maxArray[i + 1]) {
                return true;
            }
        }
        return false;
    }
}