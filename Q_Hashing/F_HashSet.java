package Q_Hashing;

import java.util.HashSet;

public class F_HashSet {

    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<>();

        // ADD
        hs.add(23);
        hs.add(45);
        hs.add(87);
        hs.add(23);

        System.out.println(hs);

        // CONTAINS
        System.out.println(hs.contains(45));

        // REMOVE
        hs.remove(87);

        System.out.println(hs);

        // SIZE
        System.out.println(hs.size());

        // CLEAR
        hs.clear();

        // IS EMPTY
        System.out.println(hs.isEmpty());
    }
    
}
