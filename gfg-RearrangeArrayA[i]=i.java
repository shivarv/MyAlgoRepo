// User function Template for Java
class Solution {
    public static void modifyArray(int[] arr) {
        Set<Integer> outputSet = new HashSet<Integer>();
        for(int arrVal: arr) {
            outputSet.add(arrVal);
        }
        for(int i = 0; i < arr.length; i++) {
            if(outputSet.contains(i)) {
                arr[i] = i;
            } else {
                arr[i] = -1;
            }
        }
    }
}