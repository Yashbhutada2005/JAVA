package B1_Bitwise_operator;

public class basics {
    public static void main(String[] args) {
        
        // AND OPERATOR (&)
        System.out.println(7 & 9);  // convert it into bit

        // OR OPERATOR (|)
        System.out.println(5 | 6);

        // XOR OPERATOR (^)
        System.out.println(5 ^ 6);

        // 1's COMPLIMENT
        System.out.println((~7));  // answer is (-8) , - because here comes MSB which means 5 (101) but before there are many zeroes so after 1's it will become 1 and acc to MSB (if 1 - (-) and 0 - (+))
        // MSB is first element of binary , LSB is last
        
        // LEFT SHIFT
        System.out.println(5<<2);

        // RIGHT SHIFT 
        System.out.println(9>>2);
    }
}
