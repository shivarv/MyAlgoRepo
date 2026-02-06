// User function Template for Java
// 2 things if total sum = 0 ,then we found the array
// or else if we found the same sumInHashKey, that means i - lastindex 
class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        // Complete the function
        int max = 0;
        int sum = 0;
        Map<Integer, Integer> output = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++) {
            //this makes -2 as 1 , -1 as 2 etc..
            //if a number is -2 or -5, to be %by 3, the next number gota be
            // +2 remainder or -1 remainder
            // if its -1 or -4 or so, the next no gota be +1 or -2
            // mathematically if n's mod is 1 for k = 3 is n + 1  % 3 = 0
            //for if n mod is -1, it means n - -1 = n +1 % 3 = 0
            sum = ((sum + arr[i]) % k + k) % k;
            if(sum == 0) {
                max = i + 1;
            }
            if(output.containsKey(sum)) {
                max = Math.max(max, i - output.get(sum));
            } else {
                output.put(sum, i);
            }
            //this output.put has to be only if containsKey(sum) isnt there,
            //else we wont get the full length
        }
        return max;
    }
}
