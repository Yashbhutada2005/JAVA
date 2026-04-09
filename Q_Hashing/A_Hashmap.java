package Q_Hashing;

import java.util.HashMap;

public class A_Hashmap {
    public static void main(String[] args) {
        
        // CREATE
        HashMap<String , Integer> hm = new HashMap<>();
        
        // PUT operation / INSERTION
        hm.put("A" , 23);
        hm.put("B" , 45);
        hm.put("C" , 87);

        System.out.println(hm);

        // GET operation
        int Value = hm.get("B");

        System.out.println(Value);

        System.out.println(hm.get("A"));

        // CONTAINS KEY == CHECKING IF KEY IS PRESENT OR NOT
        System.out.println(hm.containsKey("D"));

        // CONTAINS VALUE == CHECKING IF VALUE IS PRESENT OR NOT
        System.out.println(hm.containsValue(45));

        // REMOVE OPERATION
        hm.remove("C");

        System.out.println(hm);

        // SIZE OF HASHMAP
        System.out.println(hm.size());

        // REPLACE
        hm.replace("A", 100);

        System.out.println(hm);

        // isEmpty
        hm.clear();

        System.out.println(hm.isEmpty());

    }    
}
