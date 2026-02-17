class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum = arr[0];
        int maxSoFar = arr[0];
        for(int i = 1; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar + arr[i], arr[i]);
            maxSum = Math.max(maxSum, maxSoFar);
        }
        return maxSum;
    }
}
