class Solution {
    public int maxOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int max = 0;
        int count0 = 0;
        for(int i = 0; i < nums.length;i++) {
            //System.out.println(i + " "+count0 + " l "+ left+ " max "+max);
            if(nums[i] == 0) {
                count0++;
            }
            if(count0 < k + 1) {
                max = Math.max(max, i - left + 1);
             //   System.out.println(left + "  "+right + " max "+ max);
              //  right++;
            } else {
              //  System.out.println(" else "+ left + "r "+ right + " max "+max);
                while(left < nums.length && nums[left++] != 0 ) {
                }
                count0--;
            }
        }
        return max;
    }
}