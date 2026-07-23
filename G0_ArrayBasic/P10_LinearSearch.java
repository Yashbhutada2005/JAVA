package G0_ArrayBasic;

public class P10_LinearSearch {
    public static void main(String[] args) {
        int arr[] = {12,64,97,21,7,34,65};
        int target = 7;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
