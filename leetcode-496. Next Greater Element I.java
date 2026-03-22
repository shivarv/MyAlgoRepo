
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];
        int index = 0;
        Map<Integer, Integer> nums2Map = new HashMap<Integer, Integer>();
        Stack<Integer> decreasingStack = new Stack<Integer>();
        for(int i = nums2.length - 1; i >= 0; i--) {
            // if nums2[i] > decreasingStackTop
			// pop the stack
            while(!decreasingStack.isEmpty() 
                    && nums2[i] > decreasingStack.peek()) {
                decreasingStack.pop();
            }
            if(decreasingStack.isEmpty()) {
                nums2Map.put(nums2[i], -1);
            } else {
                nums2Map.put(nums2[i], decreasingStack.peek());
            }
            //important step
            decreasingStack.add(nums2[i]);
        }
        //nums2Map has nextGreaterElement
        for(int num: nums1) {
            output[index] = nums2Map.get(num);
            index++;
        }
        return output;
    }
}


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreaterNumber = getAllNextGreaterNumber(nums2);
        int[] output = new int[nums1.length];
        int index = 0;
        Map<Integer, Integer> nums2IndexMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums2.length; i++) {
            nums2IndexMap.put(nums2[i], i);
        }
        for(int num: nums1) {
            output[index] = nextGreaterNumber[nums2IndexMap.get(num)];
            index++;
        }
        return output;
    }

    public int[] getAllNextGreaterNumber(int[] nums) {
        int []output = new int[nums.length];
        Stack<Integer> input = new Stack<Integer>();
        for(int i = nums.length - 1 ; i >= 0; i--) {
            if(input.isEmpty()) {
                output[i] = -1;
            } else {
                while(input.isEmpty() != true && input.peek() < nums[i]) {
                    input.pop();
                }
                if(input.isEmpty()) {
                    output[i] = -1;
                } else {
                    output[i] = input.peek();
                }
            }
            input.add(nums[i]);
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}