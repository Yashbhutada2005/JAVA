package L_Divide_and_Conquer;

public class QuickSort {
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");  // Print elements instead of arr reference
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        // BASE CASE
        if(si >= ei){
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);   // Left part
        quickSort(arr, pIdx+1, ei);   // Right part
    } 

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];   // Pivot element
        int i = si - 1;        // To track the correct position for pivot

        for(int j = si; j < ei; j++){ // Correct loop condition
            if(arr[j] <= pivot){
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Swap pivot into correct position
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {4, 7, 9, 3, 1, 5 ,54 ,76 ,12 , 012 , 1 ,99};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}



