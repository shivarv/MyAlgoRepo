class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<String>();
        //HashMap<Integer, String> sb = new HashMap<Integer, String>();
       // sb.put(3, "Fizz");
    //    sb.put(5, "Buzz");
        for(int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if(i % 3 == 0) {
                sb.append("Fizz");
            }
            if(i % 5 == 0) {
                sb.append("Buzz");
            }
            if(i % 3 != 0 && i % 5 != 0) {
                sb.append(i);
            }
            output.add(sb.toString());
        } 
        return output;
    }
}