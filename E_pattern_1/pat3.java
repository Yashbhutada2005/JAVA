/*

1
12
123
1234
12345

 */

package E_pattern_1;

public class pat3 {
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
