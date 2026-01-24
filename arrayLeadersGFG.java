class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        // code here
        int arrMax[] = new int[arr.length];
        int prevMax = arr[arr.length - 1];
        int currentMax;
        for(int i = arr.length - 2; i >= 0; i--) {
            currentMax = arr[i];
            prevMax = Math.max(currentMax, prevMax);
            arrMax[i] = prevMax;
        }
        for(int i = 0; i < arr.length - 1; i++) {
           // System.out.println(arr[i] + "  "+arrMax[i]);
            if(arr[i] >= arrMax[i]){
                output.add(arr[i]);
            }
        }
        output.add(arr[arr.length - 1]);
        return output;
    }
	
	
	// one more algo:
	//the idea is find the max from reverse,that way we can track max by one variable
	//add the nums greater than max and they are leaders
	//reverse the array to maintain the order
	static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        if(arr.length < 1) {
            return output;
        }
        if(arr.length == 1) {
            output.add(arr[0]);
            return output;
        }
        int max = arr[arr.length - 1];
        output.add(max);
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] >= max){
                max = arr[i];
                output.add(max);  
            }
        }
        Collections.reverse(output);
        return output;
        
    }
}
