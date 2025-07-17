/* 

    *
   ***
  *****
 *******
*********

*/

package E_pattern_1;

public class pat7 {
    public static void main(String[] args) {


        for(int i = 0; i < 8 ; i++) {
            // space
            for(int j = 0; j < 8 - i - 1; j++) {
                System.out.print(" ");
            }

            // star
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
