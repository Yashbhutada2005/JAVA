// reverse an array list
package G2_Array_List;

import java.util.ArrayList;

public class problem1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> odd = new ArrayList<>();

        odd.add(1);
        odd.add(2);
        odd.add(3);
        odd.add(4);

        for(int i = odd.size()-1 ; i >= 0 ; i--){
            System.out.print(odd.get(i) + " ");
        }

    }
    
}
