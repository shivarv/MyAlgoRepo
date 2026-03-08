class Solution {
    public int characterReplacement(String s, int k) {
        int arrayCount[] = new int[26];
        int left = 0, right = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        while(right < s.length()) {
            char c = s.charAt(right);
            arrayCount[ c - 'A']++;
            right++;
            count++;
            if(count - getMax(arrayCount) <=k) {
                max = Math.max(max, count);
            } else {
                char removeC = s.charAt(left);
                left++;
                arrayCount[removeC - 'A']--;
                count--;
            }
        }
        return max;
    }

    int getMax(int arrayCount[]) {
        int max = 0;
        for(int arrayItem: arrayCount) {
            max = Math.max(max, arrayItem);
        }
        return max;
    }
}