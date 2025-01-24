// CHECK IF ARRAY IS SORTED OR NOT

package K_Recursion;

public class problem6 {
    public static boolean isSorted(int arr[] , int i){        // array and i are defined (data type is boolean)
        if(i == arr.length-1){      // base case = arr.length-1
            return true;            // return true
        }
        if(arr[i] > arr[i+1]){      // if previous element of array is greater than next then return false
            return false;
        }
        return isSorted(arr , i+1);   // recursivly check every element of the array
    }   

    public static void main(String[] args) {
        int arr[] = {2,5,1,8,4,6};           // array
        System.out.println(isSorted(arr , 0));
    }
}
