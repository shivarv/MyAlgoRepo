class Solution {
    public int trap(int[] height) {
        int waterCount = 0;
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length -1] = height[height.length - 1];
        for(int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        }
        for(int i = height.length - 1; i > 0; i--) {
            rightMax[i - 1] = Math.max(rightMax[i], height[i]);
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));
        for(int i = 1; i < height.length - 1; i++) {
            if( Math.min(leftMax[i], rightMax[i]) - height[i]> 0) {
                waterCount += (
                    Math.min(leftMax[i], rightMax[i]) - height[i]);
                System.out.println(waterCount);
            }
        }
        return waterCount;
    }
}

/*

class Solution {
    public int trap(int[] height) {
        int waterCount = 0;
        int lMax = height[0];
        int rMax = height[height.length - 1];
        int left = 1;
        int right = height.length - 1;
        while(left <= right) {
            if (lMax <= rMax) {
                if (height[left] < lMax) {
                    waterCount += lMax - height[left];
                }
                lMax = Math.max(lMax, height[left]);
                left++;
            } else {
                if (height[right] < rMax) {
                    waterCount += rMax - height[right];
                }
                rMax = Math.max(rMax, height[right]);
                right--;
            }
        }
        return waterCount;
    }
*/