class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        ArrayList<Integer> evenArray = new ArrayList<Integer>();
        
        int oddPointer = 0, evenPointer = 0;
        for(int i = 0; i < nums.length; i++) {
            //its +1 of actual index ,so %2 == 0 will be od
            if(i % 2 == 0) {
                oddArray.add(nums[i]);
            } else {
                evenArray.add(nums[i]);
            }
        }
        Collections.sort(oddArray);
        Collections.sort(evenArray, Collections.reverseOrder());
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                nums[i] = oddArray.get(oddPointer++);
            } else {
                nums[i] = evenArray.get(evenPointer++);
            }
        }
        return nums;
    }
}