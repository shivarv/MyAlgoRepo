// The logic is iterate every element till n - 2 so we have space for 2 more items
// go left and right pointer above the first array
// if(sum of 3 records - target < minDifference) assign minDifference = .and keep that 3 values as resultValue
// else if (sum of 3 records - target == minDifference) resultValue = Math.max(resultValue, sum of 3 records)

//https://leetcode.com/problems/3sum-smaller/description/ this is leetcode version but subscription needed
//

class Solution {
    public int closest3Sum(int[] arr, int target) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int returnValue = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 2; i++) {
            left = i + 1;
            right = arr.length - 1;
            while(left < right) {
                int currentSum = arr[left] + arr[right] + arr[i];
				// the second if else is needed to make sure we assign the max sum of values if minDiff is same
                if(Math.abs(currentSum - target) < minDiff) {
                    minDiff = Math.abs(currentSum - target);
                    returnValue = currentSum;
                } else if(Math.abs(currentSum - target) == minDiff) {
                    returnValue = Math.max(returnValue, currentSum);
                }
                if(currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return returnValue;
    }
};