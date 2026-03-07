// naive solution
class Solution {
    public int arrangeCoins(int n) {
        long output = 1;
        int count = 0;
        while(output <= n) {
            n -= output;
            output++;
            count++;
        }
        return count;
    }
}

// best solution
// this is a binary search implementation
class Solution {
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        int mid  = 0;
        boolean isLess = false;
        while(left <= right) {
            mid = (int) (left + ( right - left) /2);
            // sum of n numbers, this n is what we are finding using binary search
            long longCoin = (long) mid * (mid + 1 ) /2 ;
            if(longCoin == n) {
                return mid;
            } else if(longCoin > n) {
                right = mid - 1;
                isLess = false;
            } else {
                left = mid + 1;
                isLess = true;
            }
        }
        //mid - 1 becz we would have reached > n
        if(isLess) {
            return mid;
        }
        return mid - 1;
    }
}