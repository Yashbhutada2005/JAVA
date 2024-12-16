package conditional_operator;
import java.util.*;
public class switchstatment {
    public static void main(String[] args) {
        System.out.println("enter day :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch(number) {
            case 1 : System.out.println("monday");
                break;
            case 2 : System.out.println("tueday");
                break;
            case 3 : System.out.println("wedneday");
                break;
            case 4 : System.out.println("thursday");
                break;
            case 5 : System.out.println("friday");
                break;
            case 6 : System.out.println("satday");
                break;
            case 7 : System.out.println("sunday");
                break;
            default : System.out.println("entered invalid day");
        }
        sc.close();
    }
    
}
