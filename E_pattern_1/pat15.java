/*

A B C D E 
A B C D
A B C
A B
A

*/

package E_pattern_1;

public class pat15 {
    public static void main(String[] args) {
        
         for(int i = 5; i >= 1; i--){
            for(char ch = 'A' ; ch < 'A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    }

