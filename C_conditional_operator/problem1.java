// print largest of three number

  import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        System.out.println("enter a :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter b :");
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        System.out.println("enter c :");
        Scanner t = new Scanner(System.in);
        int c = t.nextInt();

        if(a>b && a>c) {
            System.out.println("a is greater");
        }
        if(b>c && b>a) {
            System.out.println("b is greater");
        }
        if(c>a && c>b) {
            System.out.println("c is greater");
        }
        sc.close();
        s.close();
        t.close();
    }
        
        }
        
    
