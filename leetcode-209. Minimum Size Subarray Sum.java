
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minCount = Integer.MAX_VALUE;
        int currentTarget = 0;
        while(right < nums.length) {
            currentTarget += nums[right];
            while(currentTarget >= target) {
                // +1 is needed, right isnt incremented here
                minCount = Math.min(minCount, right - left + 1);
                currentTarget -= nums[left];
                left++;
            }
            right++;
        }

        return (minCount == Integer.MAX_VALUE)? 0 : minCount;
    }
}
//my inital code
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minCount = Integer.MAX_VALUE;
        int currentTarget = 0;
        while(right < nums.length) {
            if(right < nums.length && currentTarget < target) {
                currentTarget += nums[right];
                right++;
            }
            
            if(currentTarget >= target) {
                minCount = Math.min(minCount, right - left);
                currentTarget -= nums[left];
                left++;
            }
        }
        while(currentTarget >= target && left < right) {
            currentTarget -= nums[left];
            minCount = Math.min(minCount, right - left);
            left++;
        }
        if(minCount == Integer.MAX_VALUE) {
            return 0;
        }
        return minCount;
    }
}