class Solution {

    static int minOps(int arr[], int k) {

        // Your code here
        int max = arr[0];
        int count = 0;
        for(int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for(int i = 0; i < arr.length; i++) {
            if((max - arr[i]) % k != 0 ) {
                return -1;
            }
        }
        for(int i = 0;i < arr.length; i++) {
            count += ((max - arr[i]) / k);
        }
        return count;
    }
}
