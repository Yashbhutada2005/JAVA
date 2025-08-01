/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

package E_pattern_1;

public class pat19 {
    public static void main(String[] args) {

        // upper part

        int space = 0;   // initial space
        
        //star
        for(int i=0; i<5; i++){  // as index in java start from 0 
            for(int j=1; j<=5-i; j++){     // minimum star is 1
                System.out.print("*");
            }

        //space
        for(int j=0; j<space; j++){  // as minimum space can be 0
            System.out.print(" ");
        }

        //star
        for(int j=1; j<=5-i; j++){
            System.out.print("*");
        }
        space += 2;  // space is incrementing by 2

        System.out.println();
    }
        // lower part

      space = 8;  // space is 2*n - 2

      for(int i=1; i<=5; i++){  

        // star
        for(int j=1;j<=i; j++){
            System.out.print("*");
        }

        //space
        for(int j=0; j<space; j++){
            System.out.print(" ");
        }

        //star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        space -= 2; 
        System.out.println();
      }
     // i=1 -- jab rows badh rahi ho
     // i=0 -- jab rows kaam ho rahi     
        
    }
}
