// Maximum form Array list

package G2_Array_List;
import java.util.ArrayList;
public class problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> r = new ArrayList<>();

        r.add(2);
        r.add(4);
        r.add(6);
        r.add(9);
        r.add(3);

        int max = Integer.MIN_VALUE;

        for(int i=0;  i<r.size(); i++){
            if(max < r.get(i)){
                max = r.get(i);
            }
        }
        System.out.println("Array Lst : " + r);
        System.out.println("Max Element : " + max) ;
    }
    
}
