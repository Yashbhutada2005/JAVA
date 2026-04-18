package Q_Hashing;

import java.util.HashSet;

public class I_CountDistinctElement {
    public static void main(String[] args) {
        
        int arr[]= {4,3,2,5,6,7,3,4,2,1};

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }

        System.out.println(hs); 
        System.out.println("Number of distinct elements: " + hs.size());
    }
}
