class Solution {
    //boundary binary search
    public char nextGreatestLetter(char[] letters, char target) {
        int mid;
        int left = 0;
        //right is last array item..length - 1
        
        int right = letters.length - 1;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //very important
        return (letters[left % letters.length]);
    }
}