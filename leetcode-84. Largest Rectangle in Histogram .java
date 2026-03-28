//need to learn this basics more cleanly
class Solution {
    public int largestRectangleArea(int[] heights) {
         Stack<int[]> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int start = i;

            while (!stack.isEmpty() && stack.peek()[0] > heights[i]) {
                int[] top = stack.pop();
                int height = top[0];
                int index = top[1];

                maxArea = Math.max(maxArea, height * (i - index));
                start = index; // 
            }

            stack.push(new int[]{heights[i], start});
        }

        // process remaining stack
        int n = heights.length;
        while (!stack.isEmpty()) {
            int[] top = stack.pop();
            maxArea = Math.max(maxArea, top[0] * (n - top[1]));
        }

        return maxArea;  
    }
}