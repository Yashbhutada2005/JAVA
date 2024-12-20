// NO. OF OCCURENCE

public class problem_4 {
    public static void main(String[] args) {
        int[] arr = {5,6,5,1,5} ;
        int x = 5;
        int count = 0;

        for(int i = 0; i < arr.length ; i++) {
            if(arr[i] == x) {
                count ++;
            }
        }
            System.out.println(count);
    }
    
}
