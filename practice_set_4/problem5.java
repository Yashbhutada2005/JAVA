// REVERSE AN ARRAY
package practice_set_4;

public class problem5 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};

        int start = 0;     // starting index
        int end = arr.length - 1; // ending index of array

        while(start < end ) {
             int temp = arr[start]; // temp variable
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end--;
            }
            for(int n : arr ) {
                System.out.println("Reversed Array : " + n);
            }
 

    }
    
}
