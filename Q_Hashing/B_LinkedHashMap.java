package Q_Hashing;

import java.util.LinkedHashMap;

public class B_LinkedHashMap {
    public static void main(String[] args) {

    LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();

        lhm.put("A" , 23);
        lhm.put("B" , 45);
        lhm.put("C" , 87);

        System.out.println(lhm);
    }
}
