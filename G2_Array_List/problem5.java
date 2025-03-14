// store amximum water using 2 pointer
package G2_Array_List;
import java.util.*;
public class problem5 {
    public static int storewater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            int ht = Math.min(height.get(lp) , height.get(rp)); // minm of 2
            int wid = rp - lp ;
            int currWater = ht * wid ;
            maxWater = Math.max(maxWater , currWater);

            if(height.get(lp) < height.get(rp)){  // lp - left pointer , rp - right pointer
                lp++; //shift to right
            }
            else {
                rp--; // shift to left
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storewater(height));
    }
    
}
