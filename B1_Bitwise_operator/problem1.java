// CHECK FOR EVEN OR ODD

package B1_Bitwise_operator;

public class problem1 {
    public static void evenorodd(int n) {
        int bitmask = 1;  // use to check a number

            if((n & bitmask) == 0) {
                System.out.println("Even number");
            }
            else {
                System.out.println("Odd number");
            }
    }   
    public static void main(String[] args) {
        evenorodd(8);
        evenorodd(9);
    } 
}
