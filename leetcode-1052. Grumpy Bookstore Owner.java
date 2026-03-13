class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfiedDefault = 0;
        int left = 0, right = 0;
        int extra = 0;
        int maxPossible = Integer.MIN_VALUE;
        for(int i = 0; i < grumpy.length; i++) {
            if(grumpy[i] == 0) {
                satisfiedDefault += customers[i];
            }
        }
        for(int i = 0; i < minutes; i++) {
            if(grumpy[i] == 1) {
                extra += customers[i];
            }
        }
        right = minutes;
        maxPossible = Math.max(maxPossible, satisfiedDefault + extra);
        while(right < grumpy.length) {
            if(grumpy[right - minutes] == 1) {
                extra -= customers[right - minutes];
            }
            if(grumpy[right] == 1) {
                extra += customers[right];
            }
            maxPossible = Math.max(maxPossible, satisfiedDefault + extra);
            right++;
        }
        return maxPossible;
    }
}