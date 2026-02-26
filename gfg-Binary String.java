import java.util.*;
import java.lang.*;
import java.io.*;
//generally in net ,i see formula..just count no of 1's and lets assume it is , then do k * k -1 /2 is the answer
//no clue why that is the answer indepth
//current logic what i do is 
// i keep track of no of 1's on right of 1 in array
//whenever i see 1 in a char from left to right, i simply add the no of 1's from right to left after this current elmeent
// eg : 1 0 1 0 1.. 
// first i setup count of 1's from right array
// 2 2 1 1 0
//now i loop through left to right and if element is 1 i add the no of 1's from right  
class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-- > 0)
        {
            int N = sc.nextInt();
            String S = sc.next();
            calculate(S);
        }
        
        sc.close();
    }
    
    private static void calculate(String s) {
        int right[] = new int[s.length()];
        int count = 0;
        int numOf1SoFar = 0;
        for(int i = s.length() - 1; i >= 0 ; i--) {
            right[i] = numOf1SoFar;
            if(s.charAt(i) == '1') {
                numOf1SoFar++;
            }
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                count += right[i];
            }
        }
        System.out.println(count);
    }
}