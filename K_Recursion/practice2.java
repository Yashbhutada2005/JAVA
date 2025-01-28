// reverse a string

package K_Recursion;

public class practice2 {
    public static void printRev(String str , int idx){
        // base case
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
        }    

        public static void main(String[] args) {
            String str = "abcd";
            printRev(str, str.length()-1);
        }
}
