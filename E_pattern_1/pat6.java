/*

12345
1234
123
12
1

*/

package E_pattern_1;

public class pat6 {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
