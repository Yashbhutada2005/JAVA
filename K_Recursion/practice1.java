// no. of occurence of element in array

package K_Recursion;

public class practice1 {
    public static void occurence(int arr[] , int key , int i) {
        // base case 
        if(i == arr.length){
            return ;
        }
        // kaam 
        if(arr[i] == key){
            System.out.print(i+" ");
        }

        occurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,5,2,8,9,4,1,5,7,9};
        int key = 2;
        occurence(arr, key, 0);
    }
}
