// SUM & AVERAGE OF THE ARRAY

package practice_set_4;

public class problem1 {
    public static void main(String[] args) {
      
        int arr[] = {12,34,56,7,89,98};
        float sum = 0;

        for(int element:arr) {
            sum = sum + element;

        }
        System.out.println("the sum of the array is " + sum);
        float average = sum / arr.length;
        System.out.println("the average of the array is " + average);

        
            
        }
        
    }

