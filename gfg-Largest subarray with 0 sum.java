//the crucial part is         arrayMap.put(0, -1);// -1 so i -arrayMap(will give +1)
//else if the array starts from 0 ,it will fail..eg: -31 -48 -90 54 20 95 6 -86 22..
class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer, Integer> arrayMap = new HashMap<Integer, Integer>();
        int subSequenceMax = 0;
        int sum = 0;
        
        // insert prefix sum 0 at index -1
        // to handle sum from start
        arrayMap.put(0, -1);
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arrayMap.containsKey(sum)) {
                subSequenceMax = Math.max(subSequenceMax, 
                                i - arrayMap.get(sum));
            } else {
                arrayMap.put(sum, i);
            }
        }
        return subSequenceMax;
    }
}