/*

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
    
    */
    

    // this is combination of pat 7&8
    
    package E_pattern_1;

public class pat9 {
    public static void main(String[] args) {
        
        int n = 5;

        // upper part

        for(int i =0; i < n; i++){

            // space
            for(int j=0; j<n-i-1; j++){  // spaces are reducing
                System.out.print(" ");
            }

            // star
            for(int j=0; j<2*i+1; j++){ // stars are increasing
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part

        for(int i=0; i<n; i++){

            // space
        for(int j=0; j<i; j++){  // spaces are increasing
            System.out.print(" ");
        }

        // star
        for(int j=0; j<2*n - (2*i+1); j++){  // stars are reducing
            System.out.print("*");
        }
        System.out.println();
    }  
    }
}
