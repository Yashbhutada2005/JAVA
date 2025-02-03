// REVERSE AN ARRAY

package G_Array;

public class problem12 {
    public static void reverse(int arr[]){
        int start = 0 , last = arr.length-1;

        while(start < last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        
        start++ ; 
        last-- ;
        }
    }    
    public static void main(String[] args) {
        int arr[] = {5,4,2,8,9,1};
        
        reverse(arr);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
