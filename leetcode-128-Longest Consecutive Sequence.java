
class Solution {
    public int longestConsecutive(int[] nums) {
        int maxSequence = 0;
        int sequence = 1;
        HashSet<Integer> numsSet = new HashSet<Integer>();
        for(int num: nums) {
            numsSet.add(num);
        }
        //avoid for loop of nums because it can have duplicates
        //always loop through set to avoid redoing duplicate nums
        for(int num: numsSet) {
			// num - 1 check is needed because only then it makes our code is checking begining of a sequence
			// if 3 exists already and our loop is at 4, we should avoid going to check for sequence at 4
            if(!numsSet.contains(num - 1)) {
                sequence = 1;
                while(numsSet.contains(num + sequence)) {
                    sequence++;   
                }
                // we allow even 1 item
                maxSequence = Math.max(maxSequence, sequence);
            }   
        }
        return maxSequence;
    }
}