package K_Recursion;

public class TowerOfHanoi {
    public static void TowerOfHanoi(int n , String src , String helper , String dest){

        if(n == 1){
            System.out.println("Disc " + n + " from " + src + " to " + dest);
            return;
        }
        TowerOfHanoi(n-1 , src , dest , helper);
        System.out.println("Disc " + n + " will move from " + src +  " to "+ dest );
        TowerOfHanoi(n-1 , helper , src , dest);
    } 
    public static void main(String[] args) {
        
        int n = 5;
        TowerOfHanoi(n , "S" , "H" , "D");
    }
}
