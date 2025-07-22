/*

*
**
***
****
*****
******
*****
****
***
**
*

*/

package E_pattern_1;

public class pat10 {
    public static void main(String[] args) {
        
        // pyramid
        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // inverted pyramid
        for(int i=0; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
