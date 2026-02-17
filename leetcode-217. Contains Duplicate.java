class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<Integer>();
        for(int num: nums) {
            if(numsSet.contains(num)) {
                return true;
            }
            numsSet.add(num);
        } 
        return false;
    }
}