class Solution {
    public int subarraySum(int[] nums, int k) {
        int countOfSubArray = 0;
        int sum = 0;
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length; i++) {
            sum += nums[i];
            if(sum == k) {
                countOfSubArray++;
            }
            //it has to be nums[i] - k only then numbers between it will be sum to k
            if(numsMap.containsKey(sum - k)) {
                countOfSubArray += numsMap.get(sum - k);
            }
            numsMap.put(sum, numsMap.getOrDefault(sum, 0) + 1);
        }
        return countOfSubArray;
    }
}