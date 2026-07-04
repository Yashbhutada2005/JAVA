// Switch statement
package A_Basics;

public class Problem11 {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){
        day(i);
        }
    }
    public static void day(int day){    
        switch(day){
            case 1 :
                System.out.println("Mondaay");
                break;
                case 2 :
                System.out.println("Tuesday");
                break;
                case 3 :
                System.out.println("Wednesday");
                break;
                case 4 :
                System.out.println("Thursday");
                break;
                case 5 :
                System.out.println("Friday");   
                break;
                case 6 :
                System.out.println("Saturday");
                break;
                case 7 :
                System.out.println("Sunday");
                break;
        }
    }    
}
