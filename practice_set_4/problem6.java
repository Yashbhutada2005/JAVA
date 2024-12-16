// searching of element

package practice_set_4;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};

        System.out.println("Enter the element to be searched : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.println("Array :");
        for(int i = 0; i < arr.length ; i++) {
          
           System.out.print(arr[i] + " ");
            }
            System.out.println("");
            for(int i = 0; i < arr.length ; i++) {
            if(x == arr[i]){
                System.out.println("Element " + x + " found at Index " + i);
                return ;
                  }     
        }
        sc.close();

    }
    }

