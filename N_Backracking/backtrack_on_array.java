package N_Backracking;

public class backtrack_on_array {

public static void ChangeArr(int arr[] , int i , int val) {
    // BASE CASE
    if(i == arr.length){
        PrintArr(arr);
        return;
    }
    // RECURSION
    arr[i] = val;    // ARR[I] HAS GIVEN VALUE FROM WHICH ITLL START
    ChangeArr(arr, i+1, val+1);  // CHANGE ARRAY MEANS ARRAY WILL MOVE TO NEXT BY +1
    arr[i] = arr[i] - 2;   // FUNCTION IS TO ARRAY -2

}

// PRINT ARRAY
public static void PrintArr(int arr[]) {
    for(int i = 0; i <arr.length ; i++) {
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
}
public static void main(String[] args) {
    int arr[] = new int[5];
    ChangeArr(arr, 0, 2);
    PrintArr(arr);
}
}

