//  sum of 3 element of array = 12

public class problem_8 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        int ans = 0;
        int target = 12;
        int n = arr.length;

        for(int i = 0; i < n ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                for(int k = j+1 ; k < n ; k++) {
                    if(arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    
}
