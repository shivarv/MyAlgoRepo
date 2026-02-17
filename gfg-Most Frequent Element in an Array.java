class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Map<Integer, Integer> output = new HashMap<Integer, Integer>();
        int maxVal = Integer.MIN_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(output.containsKey(arr[i])) {
                 output.put(arr[i] , output.get(arr[i]) + 1);
            } else {
                output.put(arr[i], 1);
            }
            if(output.get(arr[i]) == maxVal) {
                maxNumber = Math.max(maxNumber, arr[i]);
            } else if(output.get(arr[i]) > maxVal) {
                maxVal = output.get(arr[i]);
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }
}