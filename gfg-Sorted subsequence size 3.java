class Solution {
    public List<Integer> find3Numbers(int[] arr) {
        List<Integer> output = new ArrayList<Integer>();
        // code here
        int min[] = new int[arr.length];
        int max[] = new int[arr.length];
        min[0]  = arr[0];
        max[arr.length - 1] = arr[arr.length - 1];
        for(int i = 1; i < arr.length; i++) {
            min[i] = Math.min(min[i - 1], arr[i]);
        }
         for(int i = arr.length - 2; i >= 0; i--) {
            max[i] = Math.max(max[i + 1], arr[i]);
        }
     //   System.out.println("minnnnn ");
      //  System.out.println(Arrays.toString(min));
//        System.out.println("maxxx ");
  //      System.out.println(Arrays.toString(max));
    
        for(int i = 1 ; i < arr.length - 1; i++) {
            if(arr[i] > min [i] && arr[i] < max[i]) {
                output.add(min[i]);
                output.add(arr[i]);
                output.add(max[i]);
    //            System.out.println("in conclusion ");
                return output;
            }
        }
        return output;
    }
}