// print a charcter pattern

package E_pattern_1;
public class char_pattern {
    public static void main(String[] args) {
        
    int n =7 ;
    char ch = 'A';

    for(int i = 1; i<=n; i++) {
        for(int j = 1; j<=i ; j++) {
            System.out.print(ch);
            ch++ ;
        }
        System.out.println();
    }
}
}