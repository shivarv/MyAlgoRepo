class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        for(int i = 0 ; i < k; i++) {
            currentMax += nums[i];
        }
        max = Math.max(max, currentMax);
        for(int i = k; i < nums.length; i++) {
            currentMax -= (nums[i - k]);
            currentMax += nums[i];
            max = Math.max(max, currentMax);
        }
       // System.out.println(max);
       // this happens, if u wrote (double) (max/ k), then it would create loss in convertion
        return (double) max /k; 
    }
}