
public class basic {
    public static void main(String[] args) {
        String name =  new String("Yash");
        System.out.println(name);

        // Strings are immutable

        char ch = '*';
        int a = 12;
        float b = 12.087f;
        String s = "Yash";
        System.out.printf("the value of a is %d%n ", a );
        System.out.format("the value of b is %.3f%n", b); // .3 means after decimal point it will show only 3 digits
        System.out.printf("the value of s is %s%n", s);
        System.out.printf("the value of ch is %c%n", ch);
    }
    
}
