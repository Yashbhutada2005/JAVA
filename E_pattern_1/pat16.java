package E_pattern_1;

public class pat16 {
    public static void main(String[] args) {
        
        for(int i=0; i<6; i++){
            char ch = (char) ('A' + i);   // type casting
            for(int j=0; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
