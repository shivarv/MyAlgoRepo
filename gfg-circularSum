//Key notes:
// Make sure we assign first array element to minSum, maxSum
// Go through array , find minSum , maxSum, totalSum
// If minSum == totalSum, then return maxSum (here it means the whole array is the minArray ,thus we need to find maxArraySum in it)
// else circularSum = totalSum - minSum.. output answer is Max(maxSum, circularSum)
//for kandane's max Sum, its always Math.max(maxSoFar + arr[i], arr[i])
class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        //making minSum = arr[0], maxSum = arr[0] is needed
        // -4 , -2, -1, -2, -6// all negatives will create problem
        int minSum = arr[0];
        int minSumSoFar = 0;
        int maxSumSoFar = 0;
        int maxSum = arr[0];
        int totalSum = 0;
        int normalSum = maxSum;
        int circularSum;
        for(int arrItem: arr) {
            totalSum += arrItem;
        }
        
        for(int i = 0; i < arr.length; i++) {
            minSumSoFar = Math.min(minSumSoFar + arr[i], arr[i]);
            minSum = Math.min(minSumSoFar, minSum);
            maxSumSoFar = Math.max(maxSumSoFar + arr[i], arr[i]);
            maxSum = Math.max(maxSumSoFar, maxSum);
        }
        // the output is either totalSum - MinSum or maxSum if the minSum is same as the totalArraySum
        normalSum = maxSum;
        circularSum = totalSum - minSum;
        //if minSum == totalSum , then maxSum is general Sum logic
        if(minSum == totalSum) {
            return normalSum;
        }
        
        return Math.max(normalSum, circularSum);
    }
}
