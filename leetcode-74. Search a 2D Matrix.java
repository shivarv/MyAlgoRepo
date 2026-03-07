class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length - 1;
        int rowFoundIndex = -1;
        while(left <= right) {
            int mid = left + (right - left) /2 ;
            if(matrix[mid][0] == target) {
                return true;
            }
            if(matrix[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        rowFoundIndex = right;
        System.out.println(rowFoundIndex);
        if (rowFoundIndex < 0) return false;
        left = 0;
        right = matrix[rowFoundIndex].length -1;
        while(left <= right) {
            int mid = left + (right - left) /2 ;
            if(matrix[rowFoundIndex][mid] == target) {
                return true;
            }
            if(matrix[rowFoundIndex][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}