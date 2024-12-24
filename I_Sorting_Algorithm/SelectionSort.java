package  I_Sorting_Algorithm;

public class SelectionSort {
    
    public static void SelectionSort(int arr[]) {

        int n = arr.length;

        for(int i = 0; i < n-1; i++){                 // STARTS WITH FIRST ELEMENT GOES TILL LAST SECOND , CAUSE LAST ELEMENT IS SORTED
            int MinPos = i;                           // SMALLEST POSITION 
            for(int j= i+1; j < n; j++){              // CHECK FOR EACH ELEMENT AND UPDATE THE INDEX
                if(arr[MinPos] > arr[j]){             // IF ANY OF THE SMALL ELEMENT IS FOUNDED THEN SWAP THE ELEMENT 
                    MinPos = j;                       // UPDATE THE MINIMUM POSITION
                }
            }

            // SWAP
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

        SelectionSort(arr);                           // FUNCTION CALL

        System.out.println("Sorted Array : ");
        for(int sort : arr){
            System.out.print(sort + " ");
        }
    }
}
