package G2_Array_List;

import java.util.ArrayList;  // imports array list
// import java.util.*         // imports all properties of java
 
public class operations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  // basic syntax
        // ArrayList<String> list2 = new ArrayList<>();

        // add elements - 0(1) time complexity
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,4); // time complexity - 0(n)
        list.add(4 , 9); // this add element t specific index

        System.out.println("Array List : " + list);
        
        // get element - 0(1)
        int element = list.get(2);
        System.out.println("Element at index 2 is " + element);

        // delete element - 0(1)
        list.remove(2);
        System.out.println("Array list after deleting index 2 is " + list);

        // set element at index - 0(n)
        list.set(1, 5);
        System.out.println("Array list after set 5 at indx 3 : " + list);

        // contains element - 0(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(4));
        System.out.println(list.contains(3));

        // size of array list
        System.out.println("Size of Array List : " + list.size());

        // print array list
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
