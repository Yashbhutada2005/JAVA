package G_Array;

import java.util.*;
public class input {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n]; // no. of element in array 

        System.out.println("enter array element :");
        for(int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt(); // input of element 
        }
        for(int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " "); // print 
        }
        sc.close();
    }
    
}
