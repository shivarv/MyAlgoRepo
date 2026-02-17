
//tricky bit is ,its not < 10..
// its like identifying the pattern, so we need to use HashSet
// for eg if its 4, 4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4 (4 is already added,thats when it ends)
class Solution {
    HashSet<Integer> numsSeq = new HashSet<Integer>();
    public boolean isHappy(int n) {
        if(isHappyNumber(n) == 1) {
            return true;
        }
        return false;
    }

    private int isHappyNumber(int n) {
		//n == 1 or the sequence exists,then we found the num 
        if(numsSeq.contains(n) || n == 1) {
            return n;
        }
        numsSeq.add(n);
        int sum = 0;
        int d = 0;
        while(n > 0) {
            d = n % 10;
            sum += (d * d);
            n = n /10;
        }
        return isHappyNumber(sum);
    }
}