// ELEMENT X
package Array;

public class problem_3 {
    public static void main(String[] args) {
        
        int[] arr = {1,3,32,5,764,32,14,8,34,74,43} ;
        int x = 34;

        int ans = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                ans = i; // i = index
            }
        }
            System.out.println(ans);

    }    
}
