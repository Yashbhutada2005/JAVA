// LAST OCCURENCE
package Array;

public class problem_5 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,1,2,3,1,4,5,1,3,5,1};
        int x = 1;
        int lastcount = -1;

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == x) {
                lastcount = i;
            }
        }
        System.out.println(lastcount);
    }    
}
