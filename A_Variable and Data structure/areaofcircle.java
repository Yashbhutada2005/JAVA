import java.util.*;
    public class areaofcircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double rad = s.nextDouble();
        double area = 3.14 * rad * rad ;
        System.out.print(area);
        s.close();
    }
}