class Solution {
    //if its 1 , 5, 7 , -1, 5 and target = 6..output = 3
     //if its 1 , 5, 7 , -1, 5, 1 and target = 6..output = 5
    int countPairs(int arr[], int target) {
        // code here
        int pairsCount = 0;
        HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < arr.length; i++) {
			// this logic ensures compliment already present
            if(arrMap.containsKey(target - arr[i])) {
                pairsCount += arrMap.get(target - arr[i]);
            }
            arrMap.put(arr[i], arrMap.getOrDefault(arr[i], 0) + 1);
            
        }
        return pairsCount;
    }
}