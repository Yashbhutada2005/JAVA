package A_variable_and_data_structure;
public class typepromotion {
    public static void main(String[] args) {
       /*  char a = 'a';
           char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);  */

        int a = 5;
        float b = 10;
        long c = 15;
        double d = 20;
        double ans = a + b + c + d;
        System.out.println(ans);
    }
}
// in type promotion value of whichever data type is bigger then output will be in that data type
// java promotes each byte , char , short into int