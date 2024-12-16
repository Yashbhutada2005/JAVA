// DELETING AN ELEMENT FROM THE ARRAY 
package practice_set_4;

public class problem4 {
    public static void main(String[] args) {
        
        int delete = 77;
        int[] arr = {54,77,54,32,66,7,98};


        int[] array = new int[arr.length-1];
        int index = 0;

        System.out.print("Array :" + " ");
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] != delete) {
                array[index++] = arr[i];
            }
         }
         System.out.println("");
         System.out.println("the element to be deleted is 77");
            System.out.print("New Array : " + " ");
         for(int a : array) {
            System.out.print(a + " ");
         }

      

           
            }
            }

        