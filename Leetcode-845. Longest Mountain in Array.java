class Solution {
    public int longestMountain(int[] arr) {
        int max = 0;
        int peak = 0;
        int leftValley = 0;
        int rightValley = 0;
        //starts with 1 and ends before arr.length - 1
        for(int i = 1; i < arr.length - 1; ) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i + 1]) {
                peak = i;
                leftValley = i;
                rightValley = i;
                while(leftValley >= 1 && arr[leftValley] > arr[leftValley - 1]) {
                    leftValley--;
                }
                while(rightValley < arr.length - 1 && arr[rightValley] > arr[rightValley + 1]) {
                    rightValley++;
                }
                max = Math.max(rightValley - leftValley + 1, max);
                i = rightValley + 1;
            } else {
                i++;
            }
           
        }
        return max;
    }
}