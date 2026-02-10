package C_conditional_operator;

import java.util.*;

public class BenjaminBulb {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("BenjaminBulb");
            }
            else if(i % 3 == 0){
                System.out.println("Benjamin");
            }
            else if(i % 5 == 0){
                System.out.println("Bulb");
            }
            else {
                System.out.println(i);
            }
        }
        sc.close();
    }
    
}
