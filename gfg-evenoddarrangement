import java.util.*;

public class  GfG {

	static ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
		int startPointer = 0, endPointer;
		ArrayList<Integer> arrOut = new ArrayList<Integer>();
		for(int i = 0; i < arr.size(); i++) {
			arrOut.add(0);
		}
		endPointer = arr.size() - 1;
		Collections.sort(arr);   // ascending
		for(int i = 0; i < arr.size(); i++) {
			if(i % 2 == 0) {
				arrOut.set(i, arr.get(endPointer--));
			} else {
				arrOut.set(i, arr.get(startPointer++));
			}
		}
		return arrOut; }
	}
	
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
 
        ArrayList<Integer> res = rearrangeArray(arr);
  
        for (int num : res) {
            System.out.print(num + " ");
        }
    }