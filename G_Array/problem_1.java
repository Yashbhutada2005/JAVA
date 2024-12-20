// SUM OF THE ARRAY


public class problem_1 {
    public static void main(String[] args) {
        
        int[] arr = {12,34,56,43,12,4,53,5654,7,45,5457,655,34545,676,43};
        int sum =0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
         
        }
        System.out.println(sum);
    }
}
