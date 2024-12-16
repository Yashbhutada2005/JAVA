// DELETING AN ELEMENT FROM THE ARRAY 
package practice_set_4;

public class problem4 {
    public static void main(String[] args) {
        
        int delete = 77; // element to be deleted
        int[] arr = {54,77,54,32,66,7,98};


        int[] array = new int[arr.length-1]; // initializing new array
        int index = 0; //index start from 0 for checking 77 at what index

        System.out.print("Array :" + " ");
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] != delete) { // check for the index where 77 is present
                array[index++] = arr[i]; // update the array using index++ 
            }
         }
         System.out.println("");
         System.out.println("the element to be deleted is 77");
            System.out.print("New Array : " + " ");
         for(int a : array) { // new array
            System.out.print(a + " ");
         }

      

           
            }
            }

        