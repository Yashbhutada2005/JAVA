package I_Sorting_Algorithm;
public class BubbleSort {

    public static void BubbleSort(int arr[]) {   // FUNCTION

        int n = arr.length;                     // ARRAY LENGTH

        for(int i=0; i < n-1; i++) {            // N-1 : NUMBER OF PASSES , START FROM 0 TO N-1
            for(int j=0; j < n-1-i; j++){       // N-1-I : COMPARES THE ELEMENT FROM ADJACENT ELEMENT 
                if(arr[j] > arr[j+1]){          // EXISTING ELEMENT IS GREATER THEN IT IS SWAP WITH SMALLER 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;            // SWAP ARR[I] AND ARR[J+1]
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,7,9,1};                // ORIGNAL ARRAY

        System.out.println("Orignal Array : ");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        BubbleSort(arr);                        // FUNCTION CALL
            
        System.out.println("");
        
        System.out.println("Sorted Array : ");
        for(int sort : arr){
            System.out.print(sort + " ");
        }    
    }    
    
}
