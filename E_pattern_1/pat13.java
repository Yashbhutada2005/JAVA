/*

1 
2 3 
4 5 6 
7 8 9 10       
11 12 13 14 15

*/

package E_pattern_1;

public class pat13 {
        public static void main(String[] args) {
        
            int num = 1; // starting number

            for(int i = 1; i <= 5; i++) {
                for(int j = 1; j <=i; j++){
                    System.out.print(num + " ");
                    num = num+1; // increment number
                }
                System.out.println();
            }
    }
}