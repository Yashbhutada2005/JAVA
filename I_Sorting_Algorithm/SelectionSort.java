package  I_Sorting_Algorithm;

public class SelectionSort {
    
    public static void SelectionSort(int arr[]) {

        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int MinPos = i;
            for(int j= i+1; j < n; j++){
                if(arr[MinPos] > arr[j]){
                    MinPos = j;
                }
            }
        int temp = arr[MinPos];
        arr[MinPos] = arr[i];
        arr[i] = temp;

        }
    }
    public static void main(String[] args) {
        int arr[] = {12,32,11,67,86,45,898,6467,764};


        System.out.println("Orignal Array : ");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("");

        SelectionSort(arr);

        System.out.println("Sorted Array : ");
        for(int sort : arr){
            System.out.print(sort + " ");
        }
    }
}
