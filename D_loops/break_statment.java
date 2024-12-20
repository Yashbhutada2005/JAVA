
public class break_statment {
    public static void main(String[] args) {
        
        for(int i = 0 ; i <= 50; i++) {
            System.out.println(i);
            System.out.println("counting");

            if(i==30) {
                System.out.println("stop counting");
                break;
            }
        }
    }
}
