class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] output;
        Stack<Integer> astStack = new Stack<Integer>();
        //loop through
        for(int ast: asteroids) {
            Boolean destroyed = false;
            // if top is > 0 (right direction) and new item is < 0 and left direction
            while(!astStack.isEmpty() && astStack.peek() > 0 && ast < 0) {
                System.out.println("in while true "+ast + " "+astStack.peek());
                int topVal = astStack.peek();
                //3 possible scenerios
                // topVal is < mod of ast
                // topVal is = mod of ast
                // topVal is > mod of ast
                if(topVal < -ast) {
                    System.out.println("in topVal < -ast " +topVal);
                    astStack.pop();
                } else if(topVal == -ast) {
                    System.out.println("in topVal == -ast " +topVal);
                    astStack.pop();
                    destroyed = true;
                    break;
                } else { // top value is greater
                    System.out.println("in topVal > -ast " +topVal);
                    destroyed = true;
                    break;
                }
            }
            System.out.println("is destroyed " +destroyed);
            if(!destroyed) {
                System.out.println(" going to add "+ ast + " to stack");
                astStack.push(ast);
            }
        }
        output = new int[astStack.size()];
        //remember it has to be assigned in reverse order
        for(int i = output.length - 1; i >= 0; i--) {
            output[i] = astStack.pop();
        }
        return output;
    }
}