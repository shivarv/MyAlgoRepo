class Solution {
    int missingNum(int arr[]) {
        //if arr length is 3, with 1 num missing, the arr.length +1
        //need to use long for big sum error
        long n = arr.length;
        long supposedValue = (n + 1) * (n + 2) / 2;
        for(int arrVal: arr) {
            supposedValue -= arrVal;
        }
       // System.out.println(supposedValue);
     //   System.out.println(totalSum);
        return (int) supposedValue;
    }
}