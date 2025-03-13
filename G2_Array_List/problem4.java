// store maximum water
package G2_Array_List;
import java.util.*;
public class problem4 {
    public static int storewater(ArrayList<Integer> height){
        int maxWater = 0;

        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i) , height.get(j)); // used to find the minimum height of the 2 index
                int wdh = j-i; // distance betn 2 index
                int currWater = ht * wdh; // amount of water stored
                maxWater = Math.max(maxWater , currWater); // updating maxWater
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
