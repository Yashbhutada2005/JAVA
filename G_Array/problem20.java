// Rotate Array to left by one

package G_Array;

public class problem20 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        // Store first element 
        int first = arr[0];

        // Shifting array by 1
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        // Setting last element as First
        arr[arr.length-1] = first;

        // Print array
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
