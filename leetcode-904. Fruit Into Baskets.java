class Solution {
     public int totalFruit(int[] fruits) {
        Map<Integer, Integer> fruitsTypeCountMap  = new HashMap<Integer, Integer>();
        int left = 0, right = 0;
        int max = Integer.MIN_VALUE;
        while(right < fruits.length) {
            fruitsTypeCountMap.put(fruits[right], 
                fruitsTypeCountMap.getOrDefault(fruits[right], 0) + 1);
            right++;
            while(fruitsTypeCountMap.size() > 2) {
                fruitsTypeCountMap.put(fruits[left], fruitsTypeCountMap.get(fruits[left]) - 1);
                if(fruitsTypeCountMap.get(fruits[left]) == 0) {
                    fruitsTypeCountMap.remove(fruits[left]);
                }
                left++;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }

}
/*
class Solution {
    public int totalFruit(int[] fruits) {
        int[] fruitsTypeCount  = new int[fruits.length];
        int left = 0, right = 0;
        int max = Integer.MIN_VALUE;
        while(right < fruits.length) {
            fruitsTypeCount[fruits[right]]++;
            right++;
            while(isFruitTypeGreaterThan2(fruitsTypeCount)) {
                fruitsTypeCount[fruits[left]]--;
                left++;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }

    private boolean isFruitTypeGreaterThan2(int[] fruitsTypeCount ) {
        int count = 0;
        for(int fruitTypeCount: fruitsTypeCount) {
            if(fruitTypeCount > 0) {
                count++;
            }
            if(count > 2) {
                return true;
            }
        }
        return count > 2 ?  true : false;
    } 
} */