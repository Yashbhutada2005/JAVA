package A_variable_and_data_structure;
import java.util.*;
    public class cost {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float pen = sc.nextFloat();
            float pencil = sc.nextFloat();
            float eraser = sc.nextFloat();

            float bill =( pen + pencil + eraser);
            System.out.println("bill is : " + bill);

            float total = bill + (bill * 0.18f);
            System.out.println("bill with 18% gst is : " + total);

            sc.close();
        }
}
