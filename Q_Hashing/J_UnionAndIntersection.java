package Q_Hashing;

import java.util.HashSet;

public class J_UnionAndIntersection {
    public static void main(String[] args) {
        
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> hs = new HashSet<>();

        // UNION
        for(int i = 0; i < arr1.length; i++){
            hs.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            hs.add(arr2[i]);
        }

        System.out.println("Union of the two arrays: " + hs);
        System.out.println("Number of elements in the union: " + hs.size());
    

        // INTERSECTION

        hs.clear();

        for(int i = 0; i < arr1.length; i++){
            hs.add(arr1[i]);
        }

        System.out.print("Intersection of the two arrays: " + "" );
        int count = 0;
        for(int i = 0; i < arr2.length; i++){
            // check if the element of arr2 is present in hs or not
            if(hs.contains(arr2[i])){
                // print common element
                System.out.print(arr2[i] + " ");
                // increase count of common element
                count++;
                // remove the common element from hs
                hs.remove(arr2[i]);
            }
        }
        System.out.println();
        System.out.println("Count of Intersection of the two arrays: " + count);
    }       
}
