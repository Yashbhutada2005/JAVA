package Q_Hashing;

import java.util.TreeSet;

public class H_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(23);
        ts.add(45);
        ts.add(87);
        ts.add(23);

        System.out.println(ts);
    }
}
