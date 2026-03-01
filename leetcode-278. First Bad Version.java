/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = 0;
        //left has to be less than right
        //since we dont do mid - 1
        while(left < right) {
            mid = left + (right - left) /2;
            // important distinction .. right = mid , not mid - 1...
            // this logic ensures we find the lowest isBadVersion
            // if we found isBad, now we try to still search from left to right to know if there is anything less than mid which matches isBad true
            if(isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}