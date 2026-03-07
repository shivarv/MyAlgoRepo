class Solution {

    public int findKthPositive(int[] arr, int k) {

        // missing before first element
        if (k <= arr[0] - 1) {
            return k;
        }

        k -= (arr[0] - 1);

        for (int i = 1; i < arr.length; i++) {

            int gap = arr[i] - arr[i-1] - 1;

            if (gap >= k) {
                return arr[i-1] + k;
            }

            k -= gap;
        }

        return arr[arr.length - 1] + k;
    }
	
}
//best solution
/*

class Solution {
    //my understanding of this algo is
    // arr[mid] - (mid +1) is supposed to be 0, anything else means 
    //we need to move left or right
    // the left essentially sits at the place where + k gives us the answer
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + k;
    }
}
*/