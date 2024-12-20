package String;

public class StringMethods {
    public static void main(String[] args) {
        
        String name = "Yashbhutada";

    // String Methods Are :

    int value ;

        // 1. Length of string
        value = name.length();
        System.out.println(value);

        // 2. lower case
        String lower = name.toLowerCase();
        System.out.println(lower);

        // 3. upper case
        String upper = name.toUpperCase();
        System.out.println(upper);

        // 4. trim string
        String t = "     YashBhutada   ";
        System.out.println(t.trim());

        // 5. substring
        String s = name.substring(2,7);
        System.out.println(s);

        // 6. Replace
        String r = name.replace('b','r');
        System.out.println(r);

    
    }
}
