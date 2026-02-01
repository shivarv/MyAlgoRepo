// User function Template for Java

class Solution {
    public static int closestToZero(int arr[], int n) {
        // your code here
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
    
        for(int i = 0 ; i < arr.length; i++) {
            
            int left = i + 1; //first element chosen is i, rest element will be in i+1
            int indexVal = arr[i];
            int right = arr.length - 1;
   
            while(left  <= right) {
                int mid = (left + right) / 2;
                int currentSum = indexVal + arr[mid];
                if(currentSum == 0) {
                    return 0;
                }
                if(Math.abs(currentSum) < Math.abs(result)) {
                    result = currentSum;
                } else if(Math.abs(currentSum) == Math.abs(result)) {
                    result = Math.max(currentSum, result);
                }
                //decision is based on currentSum
                if(currentSum < 0){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return result;
        
    }
}