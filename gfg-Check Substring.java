//use this commend to paste some code in gfg editor
//window.ace.edit(document.querySelector(".ace_editor")).setValue(`import java.util.*;`);
// this contains the code for the main reading args code
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine().trim());
        
        while (N-- > 0) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            
            System.out.println(A.indexOf(B));
        }
        
        sc.close();
    }
}