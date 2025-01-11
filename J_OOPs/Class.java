package J_OOPs;

public class Class {

    public static class student {       // Created a Class
        String name;
        String div;
        int roll_no;      // this means we created our own data type
        double percentage;
    }

    public static void main(String[] args) {
        
        student s1 = new student();     // Info
        s1.name = "Yash Bhutada";
        s1.div = "A";
        s1.roll_no = 52;
        s1.percentage = 99.99;

        System.out.println("* Student Details *");
        System.out.println("-------------------");
        System.out.println("Name : " + s1.name);    // Displaying info
        System.out.println("Div - " + s1.div);
        System.out.println("Roll no. " + s1.roll_no);
        System.out.println("Percentage - " + s1.percentage);
    }
    
}
