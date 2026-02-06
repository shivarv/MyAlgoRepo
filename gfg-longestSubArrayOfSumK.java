// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int maxSubArrayCount = 0;
        int sum = 0;
        Map<Integer, Integer> output = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k) {
                maxSubArrayCount = i + 1;
            }
            // this means from index of sum - k to here it becomes sum.. 
            // means the sum between the items is k
            if(output.containsKey( sum - k)) {
               maxSubArrayCount = Math.max(
                   maxSubArrayCount, i - (output.get( sum - k)));
            } 
            //important step to only add sum if it doesnt exist to maintain the long subarray
            if(!output.containsKey(sum)) {
                output.put(sum, i);
            }
        }
        return maxSubArrayCount;
    }
}
