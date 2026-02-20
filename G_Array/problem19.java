package G_Array;

public class problem19 {
    public static void main(String[] args) {
        
        int ar[] = {2,5,3,7};
        int br[] = {1,2,7,4,8,0,3};
        int maxLength = Math.max(ar.length , br.length);
        int diff[] = new int[maxLength];

        for(int i=0; i<maxLength; i++){
            int a = 0;
            int b = 0;

            if(i < ar.length){
                a = ar[i];
            }
            if(i < br.length){
                b = br[i];
            }
            diff[i] = a-b;
        }
        for(int x : diff){
            System.out.print(x + " ");
        }
    }
}
