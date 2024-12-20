// print half pyramid pattern

package E_pattern_1;

public class half_pyramid_pattern {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
