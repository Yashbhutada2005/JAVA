// Second Maximum

package G_Array;

public class problem13 {
    public static void main(String[] args) {
        
        int a[] = {10 ,2, 54 ,32};

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                second = max;
                max = a[i];
            }
            else if(a[i] > second && a[i] != max){
                second = a[i];
            }
        }
        System.out.println("Second element : " + second);
    }
}
