import java.util.Arrays;

class GfG {

    static int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum = arr[0];
        int maxSoFar = arr[0];
        for(int i = 1; i < arr.length; i++) {
			//keyPoints
            maxSoFar = Math.max(maxSoFar + arr[i], arr[i]);
            maxSum = Math.max(maxSum, maxSoFar);
        }
        return maxSum;
	}
	
	public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
	
}