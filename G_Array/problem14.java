// Second Smallest Element 
 
package G_Array;

public class problem14 {
    public static void main(String[] args) {
        
        int[] a = {32,65,22,12,77};

        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i] < min){
                second = min;
                min = a[i];
            }
        }
        System.out.println(second);
    }
}
