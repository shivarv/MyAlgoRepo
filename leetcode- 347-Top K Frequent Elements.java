//important note is make sure to build reversecount to have nums.length array else .get will throw exception
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int outputCount = 0;
        Map<Integer, Integer> numsCountMap = new HashMap<Integer, Integer>();
        List<List<Integer>> reverseCount = new ArrayList<>();
        int[] output = new int[k];
        for(int i = 0; i < nums.length; i++) {
            numsCountMap.put(nums[i], numsCountMap.getOrDefault(nums[i], 0) + 1);
            reverseCount.add(new ArrayList<Integer>());
        }
        reverseCount.add(new ArrayList<Integer>());
        for (Map.Entry<Integer, Integer> entry : numsCountMap.entrySet()) {
            List<Integer> outcome = reverseCount.get(entry.getValue());
            outcome.add(entry.getKey());
            reverseCount.set(entry.getValue(), outcome);
        }
        Collections.reverse(reverseCount);
        for(List<Integer> array: reverseCount)  {
            for(Integer innerArray: array) {
                output[outputCount] = innerArray;
                outputCount++;
                if(outputCount >= k) {
                    break;
                }
            }
            if(outputCount >= k) {
                    break;
             }
        }
        return output;
    }
}


//proper solution

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> countMap = new HashMap<>();

        // 1️⃣ Count frequency
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 2️⃣ Create buckets (max frequency <= nums.length)
        List<List<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        // 3️⃣ Fill buckets
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets.get(freq).add(num);
        }

        // 4️⃣ Collect top k from highest frequency
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.size() - 1; i >= 0 && index < k; i--) {
            for (int num : buckets.get(i)) {
                result[index++] = num;
                if (index == k) break;
            }
        }

        return result;
    }
}
