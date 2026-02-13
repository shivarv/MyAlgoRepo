class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> xSet = new TreeSet<Integer>();
        Set<Integer> ySet = new TreeSet<Integer>();
        for(int i = 0 ; i < matrix.length;i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    xSet.add(i);
                    ySet.add(j);
                }
            }
        }
        for(Integer yValue: ySet) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][yValue] = 0;
            }
        }
        for(Integer xValue: xSet) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[xValue][j] = 0;
            }
        }
    }
}