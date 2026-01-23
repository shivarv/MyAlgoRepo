public class BinarySearch {
    public static void main(String[] args) {
        int output[] = {12, 21, 35, 45 , 51};
		System.out.println("12 outputLocation is " + findX(output, 12));
		System.out.println("21 outputLocation is " + findX(output, 21));
		System.out.println("35 outputLocation is " + findX(output, 35));
		System.out.println("51 outputLocation is " + findX(output, 51));
		System.out.println("6 outputLocation is " + findX(output, 6));
		System.out.println("71 outputLocation is " + findX(output, 71));

    }
	
	private static int findX(int arr[], int target) {
		int returnVal = - 1;
		int left = 0;
		int right = arr.length - 1;
		int mid = right / 2;
		while(left <= right) {
			mid = (left + right) / 2;
			if(arr[mid] == target) {
					return mid;
			}
			if( arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return returnVal;
	}
}
