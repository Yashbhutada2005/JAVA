//MAXIMUM VALUE

package G_Array;

public class problem_2 {
    public static void main(String[] args) {
        
        int[] arr = {12,3,5,3,54,67,44,653,43,264,23,7532};
        int ans = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}