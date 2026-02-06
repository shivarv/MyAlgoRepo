class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int totalCount = 0;
        int sum = 0;
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for(int i = 0 ;i < nums.length; i++) {
            sum = ((sum + nums[i]) % k + k) % k;
            if(sum == 0) {
                totalCount++;
            }
            if(numsMap.containsKey(sum)) {
                totalCount = totalCount + numsMap.get(sum);
            }
            numsMap.put(sum, numsMap.getOrDefault(sum, 0) + 1);
            
            
        }
        return totalCount;
    }
}