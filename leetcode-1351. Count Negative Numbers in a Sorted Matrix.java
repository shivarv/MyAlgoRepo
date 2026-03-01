class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            int left = 0;
            int right = grid[i].length - 1;
            int mid = 0;
            while(left < right) {
                mid = left + (right - left) / 2;
                if(grid[i][mid] < 0) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if(grid[i][left] < grid[i].length && grid[i][left] < 0)
                count += (grid[i].length - left);
            System.out.println(left );
            System.out.println(grid[i].length - left );

        }
        return count;
    }
}