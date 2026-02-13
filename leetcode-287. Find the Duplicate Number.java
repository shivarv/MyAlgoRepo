class Solution {
    public int findDuplicate(int[] nums) {
        //flyod's cycle
        int slowPointer = 0;
        int fastPointer = 0;
        int anotherSlowPointer = 0;
        // this logic gives the intersection of fastPointer and slowPointer
        while(true) {
            slowPointer = nums[slowPointer];
            fastPointer = nums[nums[fastPointer]];
            if(slowPointer == fastPointer) {
                break;
            }
        }
        //this gives us to identify the start of loop
        //the start of loop is the number 
        while(anotherSlowPointer != fastPointer) {
            anotherSlowPointer = nums[anotherSlowPointer];
            fastPointer = nums[fastPointer];
        }
        return anotherSlowPointer;

    }
}