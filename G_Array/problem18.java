package G_Array;

public class problem18 {
    public static void main(String[] args) {
        
        int ar[] = {1,2,3};
        int br[] = {2,4,7,5,6};
        int maxLength = Math.max(ar.length , br.length);
        int sum[] = new int[maxLength];

        for(int i=0; i< maxLength; i++){
            int a = 0; 
            int b = 0;

            if(i < ar.length){
                a = ar[i];
            }
            if(i < br.length){
                b = br[i];
            }
            sum[i] = a+b;
        }
        for(int x : sum){
            System.out.print(x + " ");
        }
    }
}
