class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> itemsSet = new HashSet<Integer>();
        int pointer1 = 0, pointer2 = 0, l1  = nums1.length , l2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(pointer1 < l1 && pointer2 < l2) {
            if(nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else if(nums2[pointer2] < nums1[pointer1]) {
                pointer2++;
            } else {
                itemsSet.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            }
        }
        return itemsSet.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
    /*
    //this logic will also include duplicates
    ( List<Integer> arrayItemsList = new ArrayList<Integer>();
        int pointer1 = 0, pointer2 = 0, l1  = nums1.length , l2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(pointer1 < l1 && pointer2 < l2) {
            if(nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else if(nums2[pointer2] < nums1[pointer1]) {
                pointer2++;
            } else {
                arrayItemsList.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            }
        }
        return arrayItemsList.stream()
                          .mapToInt(Integer::intValue)
                          .toArray();) */
}