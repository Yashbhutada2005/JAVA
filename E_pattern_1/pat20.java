package E_pattern_1;

public class pat20 {
    public static void main(String[] args) {
        
        // upper part 

        int n = 5;
        int space = 2*n - 2;

        // star
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

        // space
        for(int j=0; j<space; j++){
            System.out.print(" ");
        }

        // star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        space -=2;
        System.out.println();
        }

        // lower part

         space = 2;

         //star
         for(int i = n-1; i >= 1; i--) {
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

        // space
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }

        //star
         for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            space += 2;
            System.out.println();
         }


    }
}
