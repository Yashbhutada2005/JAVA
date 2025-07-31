package E_pattern_1;

public class pat18 {
    public static void main(String[] args) {
        
        for(int i=0; i < 5; i++){
            char ch = (char)('E'-i); // type casting
            for(int j=0; j<=i; j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}
