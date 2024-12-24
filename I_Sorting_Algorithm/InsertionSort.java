package I_Sorting_Algorithm;

public class InsertionSort {
    
    public static void InsertionSort(int arr[]) {

        for(int i = 1; i < arr.length; i++){      //  START FROM 2 ELEMENT (SORTING)
            int curr = arr[i];                    //  ELEMENT TO BE INSERTED
            int prev = i-1;                       //  INDEX OF PREVIOUS ELEMENT 


            while(prev >= 0 && arr[prev] > arr[curr]){      //  SHIFT ELEMENT OF SORTED PORTION THAT ARE GREATHER THAN CURRENT ELEMENT
                arr[prev+1] = arr[prev];                    //  IF THE ELEMENT IS FOUND THEN UPDATE THE INDEX
                prev--;                                     //  
            }
        }
        
    }
}
