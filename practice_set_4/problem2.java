// NUMBER OF OCCURENCE IN THE ARRAY

package practice_set_4;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        
        int[] arr = {12,34,53,21,34,55,55,43,55,32,55,55};
        
        int count = 0;
        System.out.println("Enter the element to be searched :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("The array is");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
           
            if(x == arr[i]) {
                count ++; // to count the no. of occurence 
        }
        }
        System.out.println("");
        System.out.println("the number of occurence of " + x + " in the array is " + count);
        sc.close();
    }
}
    
