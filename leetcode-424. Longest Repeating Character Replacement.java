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

// the below one is the anser for the leetcode-424..not sure what is the actual problem for the above
/*

class Solution {
    public int characterReplacement(String s, int k) {
        int[] totalCharsCount = new int[26];
        int longestCharCount = 0;
        for(int i = 0; i < s.length(); i++) {
            totalCharsCount[s.charAt(i) - 'A']++;
        }
        Arrays.sort(totalCharsCount);
        reverse(totalCharsCount);
        for(int i = 0; i < k; i++) {
            longestCharCount += totalCharsCount[i];
        }
        return longestCharCount;

    }

    
    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

}
*/