// FIRST OCCURENCE IN ARRAY

package K_Recursion;

public class problem7 {
    public static int FirstOccurence(int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccurence(arr, key, i+1);
    }    

    public static void main(String[] args) {
        int arr[] = {2,4,6,7,3,5,9,8,4,1,7};
        System.out.println(FirstOccurence(arr,8 , 0));
    }
}
