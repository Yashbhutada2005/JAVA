// GREATER THAN  X
    package Array;

public class problem_6 {
    public static void main(String[] args) {
        int[] arr = {12,34,54,12,346,87,43,23};
        int count = 0;
        int x =12;

        for(int i = 0; i < arr.length ; i++) {
            if(arr[i] > x) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
