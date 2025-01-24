// LAST OCCURENCE 

package K_Recursion;

public class problem8 {
    public static int LastOccurence(int arr[] , int key , int i){
        if(i == arr.length){      // base case
            return -1;
        }
         int isFound = LastOccurence(arr , key , i+1);        // first check for the occurence
        if(isFound == -1  &&  arr[i] == key){      // if isFound is has valid key and check for key in array
            return i;    // return
        }
        return isFound;     
    }    
    public static void main(String[] args) {
        int arr[] = {4,2,5,7,8,3,5,8,9,4};
        System.out.println(LastOccurence(arr, 8, 0));
    }
}
