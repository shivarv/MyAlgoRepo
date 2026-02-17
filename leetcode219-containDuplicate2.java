class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> outputMap  = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(outputMap.containsKey(nums[i])) {
                if(i - outputMap.get(nums[i]) <= k) {
                    return true;
                }
            }
            outputMap.put(nums[i], i); 
        }
        return false;
    }
}