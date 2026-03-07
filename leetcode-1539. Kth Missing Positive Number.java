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
    /*
    public int findKthPositive(int[] arr, int k) {
        int missingNums = 0;
        if(arr[0] > 1) {
            missingNums = arr[0] - 1;
        }
        if(k <= missingNums) {
            return k;
        } else {
            k -= missingNums;
        }
        for(int i = 1; i < arr.length; i++) {
            System.out.println(i  + " k " +k);
            if(arr[i] - arr[i -1] != 1) {
                if(arr[i] - arr[i -1] >= k + 1) {
                    return arr[i - 1] + k;
                }
                k = k - (arr[i] - arr[i -1]) + 1;
            }
           
        }
        return arr[arr.length - 1] + k;
    } */
}