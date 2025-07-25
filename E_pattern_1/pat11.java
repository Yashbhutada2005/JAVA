/*

1
01   
101  
0101 
10101

*/

package E_pattern_1;

public class pat11 {
    public static void main(String[] args) {
        
        int start =1;

        for(int i=0 ; i<5; i++){

            if(i % 2 == 0){
                start =1;
            } else {
                start = 0;
            }

            for(int j=0; j<=i; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}
