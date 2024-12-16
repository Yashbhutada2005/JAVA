// MAXIMUM AND MINIMUM IN THE ARRAY 
package practice_set_4;

public class problem3 {
    public static void main(String[] args) {

            System.out.println("the array is");
        int[] arr = { 12,30,43,21,34,56,34,56,65,45};
        int x = arr[0]; // maximum
        int y = arr[0]; // minimum
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            if(x < arr[i]){ // < showing that the current value of x is less than the value in the array 
                x = arr[i];
            }
            if(y > arr[i]) { // > showing that the current value of x is more than the value in the array
                y = arr[i] ;
            }
            
        }
        System.out.println("");
        System.out.println("The Maximum value is " + x);
        System.out.println("The Minimum value is " + y);
        
    }
}