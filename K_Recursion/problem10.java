// tiling problem

package K_Recursion;

public class problem10 {
    public static int tilingproblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        // vertical tiling
        int fnm1 = tilingproblem(n-1);

        // horizontal tiling 
        int fnm2 = tilingproblem(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;
    }    

    public static void main(String[] args) {
        System.out.println(tilingproblem(6));
    }
}
