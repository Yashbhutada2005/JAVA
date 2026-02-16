// Sorted

package G_Array;

public class problem15 {
    public static void main(String[] args) {
        
        int a[] = {12,34,32,76,89,54};
            boolean Sorted = true;

            for(int i=0; i<a.length-1; i++){
                if(a[i] > a[i+1]){
                    Sorted = false;
                    break;
                }
            }
            if(Sorted){
                System.out.println("Array is Sorted");
            }
            else{
                System.out.println("Array is Not sorted");
            }
    }
}
