/*

 *********
  *******
   *****
    ***
     *
    
     
*/

package E_pattern_1;

public class pat8 {

    public static void main(String[] args) {
        
        for (int i = 0; i <=5; i++) {

            // spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2*5 - (2*i+1); j++) {  // for star - 2*N - (2*i+1)
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
