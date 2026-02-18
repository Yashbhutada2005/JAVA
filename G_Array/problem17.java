// move all 0 to end

package G_Array;

public class problem17 {
    public static void main(String[] args) {
        
        int a[] = {12,0,4,0,22,3,0,0,4,2};

        int k = 0; // index for 0

        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                a[k++] = a[i];   // copy 0 from array
            }
        }
        while(k < a.length){
            a[k++] = 0;
        }
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
