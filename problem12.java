// freinds pairing

package K_Recursion;

public class problem12 {
    public static int freindspairing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        // single
        int fnm1 = freindspairing(n-1);

        // pairing
        int fnm2 = freindspairing(n-2);
        int pairways = (n-1) * fnm2;

        // total ways
        int totalways = fnm1 + pairways;
        return totalways;
    }    

    public static void main(String[] args) {
        
        System.out.println(freindspairing(6));
    }
}
