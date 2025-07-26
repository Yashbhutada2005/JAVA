/*

1        1
12      21
123    321
1234  4321
1234554321

*/

package E_pattern_1;

public class pat12 {
    public static void main(String[] args) {
        int n = 5;

        // initial space of 1 row
        int space = 2*(n-1);

        for(int i = 1; i <= n; i++) {

            //numbers
            for(int j = 1; j<=i; j++){
                System.out.print(j); // print numbers
            }

            //spaces
            for(int j=1; j<=space; j++){
                System.out.print(" ");  // print spaces
            }

            //numbers
            for(int j=i; j>=1; j--){
                System.out.print(j);  // print numbers
            }
            System.out.println();

            space -= 2;  // as number increases by 2 , space decrease by 2
        }
    }
}
