//BINARY SEARCH

package G_Array;

public class problem_11 {
    public static int BinarySearch(int arr[] , int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){    // find mid
            int mid = (start + end)/2;

        if(arr[mid] == key){   // mid
            return mid;
        }
        if(arr[mid] < key){       // right part
            start = mid+1;
        }
        else {               // left part
            end = mid-1;
        }
    }    
    return -1; // key not exist
}
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8};
    int key = 6;

    System.out.println("Index for key is " + BinarySearch(arr, key));
}
}

