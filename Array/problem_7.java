//SUM OF VALUE OF 2 ELEMENT = 7 

package Array;

public class problem_7 {
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        int ans = 0;
        int target = 7;

        for(int i = 0; i < arr.length ; i++) {
            for(int j = 0; j < arr.length ; j++) {
            if(arr[i] + arr[j] == target) {
                ans++;
            }
        }
    }
    System.out.println(ans);
}
}