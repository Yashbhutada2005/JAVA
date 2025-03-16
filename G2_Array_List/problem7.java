// pair sum 1 - target value using 2 pointer approach

package G2_Array_List;
import java.util.*;

public class problem7 {

    public static boolean pairsum(ArrayList<Integer> list , int target){

        int lp =0 ;
        int rp = list.size()-1;
        while(lp != rp){

            if(list.get(lp)+list.get(rp) == target){
                return true ;
            }

            if(list.get(lp)+list.get(rp) < target){
                lp++;
            }

            if(list.get(lp)+list.get(rp) > target){
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 8;

        System.out.println(pairsum(list, target));
    }
    
}
