package G2_Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5 );
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);

        System.out.println("Normal ArrayList : " + list);

        // sorting in ascending order
        Collections.sort(list);
        System.out.println("Ascending ArrayList : " + list);

        // sorting in descending order
        Collections.sort(list , Collections.reverseOrder());
        // comparator operator (Collections.reverseOrder()) - function in java
        System.out.println("Descending ArrayList : " + list);

    }
    
}
