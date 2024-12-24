package H_String;

public class StringMethods {
    public static void main(String[] args) {
        
        String name = "Yashbhutada";

    // String Methods Are :

    int value ;

        // 1. Length of string (use to find the length of String)
        value = name.length();
        System.out.println(value);

        // 2. lower case
        String lower = name.toLowerCase();
        System.out.println(lower);

        // 3. upper case
        String upper = name.toUpperCase();
        System.out.println(upper);

        // 4. trim string  (remove whitespaces)
        String t = "     YashBhutada   ";
        System.out.println(t.trim());

        // 5. substring  (print the string from starting index(2) to ending index(7))
        String s = name.substring(2, 7);
        System.out.println(s);

        // 6. Replace   (replace a char (b) to (r))
        String r = name.replace('b','r');
        System.out.println(r);

        // 7. charAt  (find the char at index(3))
        System.out.println(name.charAt(3));

        // 8. split  (conver string into array)
        String fruits = "mango , banana , grapes";
        String[] fruit = (fruits.split(" , "));
        for(String fru : fruit){
            System.out.println(fru);
        }

        // 9. concatination  (combine two strings)
        System.out.println(name.concat(fruits) + "");

        // 10. index of  (missed character from a string)
        System.out.println(name.indexOf("hutada"));

        // 11. last index of  (left character from a string)
        System.out.println(name.lastIndexOf("hbhutada"));

        // 12. replace (old string , new string)
        System.out.println(name.replace("bhutada", "op" ));

        // 13. contains  (specific character in string exist or not)
        System.out.println(name.contains("t"));

       // 14. value of  (conver string to int)
       int num = 130905;
       String qw = String.valueOf(num);
       System.out.println(qw); 
    }
}
