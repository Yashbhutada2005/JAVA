// Swap 2 indexes

package G2_Array_List;

import java.util.ArrayList;

public class problem3 {

    public static void swap(ArrayList<Integer> list , int indx1 , int indx2){

        // swap function
        int temp = list.get(indx1);  
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {

        int indx1 = 1;  // 1 & 3 are indexes to b swapped
        int indx2 = 3;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        swap(list , indx1 , indx2);
        System.out.println(list);










        
    }
}
