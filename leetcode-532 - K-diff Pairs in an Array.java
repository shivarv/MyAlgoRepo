//similar to gfg pair problem but here duplicate pair isnt allowed
//constraint of i != j can be true for a pair only if k = 0 ,else it wont
class Solution {
    public int findPairs(int[] nums, int k) {
       if (k < 0) return 0; // absolute difference can't be negative

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (k == 0) {
            for (int freq : map.values()) {
                if (freq > 1) count++;
            }
        } else {
            for (int num : map.keySet()) {
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }

        return count;
    
    }
}