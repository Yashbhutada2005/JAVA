/*

A 
A B         
A B C       
A B C D     
A B C D E   
A B C D E F

*/

package E_pattern_1;

public class pat14 {
    public static void main(String[] args) {
        
        for(int i = 0; i <= 5; i++){
            for(char ch = 'A' ; ch <= 'A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

