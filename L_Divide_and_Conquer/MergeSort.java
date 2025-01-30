package L_Divide_and_Conquer;

    public class MergeSort {
        
        // ARRAY
        public static void printArray(int arr[]) {
            for(int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        // MERGE SORT
        public static void mergeSort(int arr[], int si, int ei) {
            // BASE CASE
            if (si >= ei) {
                return;
            }
            // Divide
            int mid = si + (ei - si) / 2;
            mergeSort(arr, si, mid);    // LEFT PART
            mergeSort(arr, mid + 1, ei);   // RIGHT PART
            merge(arr, si, mid, ei);
        }
    
        // MERGE 
        public static void merge(int arr[], int si, int mid, int ei) {
            int temp[] = new int[ei - si + 1];
            int i = si;    // ITERATION FOR LEFT PART
            int j = mid + 1;  // ITERATION FOR RIGHT PART
            int k = 0;      // ITERATION FOR TEMP ARRAY
    
            while (i <= mid && j <= ei) {
                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
    
            // LEFT PART 
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
    
            // RIGHT PART
            while (j <= ei) {
                temp[k++] = arr[j++];
            }
    
            // COPY TEMP TO ORIGINAL ARRAY
            for (k = 0, i = si; k < temp.length; i++, k++) {
                arr[i] = temp[k];
            }
        } 
    
        public static void main(String[] args) {
            int arr[] = {6, 3, 9, 5, 2, 8};
            mergeSort(arr, 0, arr.length - 1);
            printArray(arr);
        }
    }
    
    
    