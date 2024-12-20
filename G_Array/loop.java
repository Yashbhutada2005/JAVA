package G_Array;

public class loop {
     public static void main(String[] args) {
        int ages[] = new int[3];
        String[] names = new String[3];
        float[] weight = {44,66,88,98,54};

        ages[0] = 12;
        ages[1] = 14;
        ages[2] = 34;

        names[0] ="yash";
        names[1] ="smit";
        names[2] ="devanshu";

        //USING FOR LOOP for printing multiple times

        for(int i = 0; i < 3; i++) {
            System.out.println(ages[i]);
            System.out.println(names[i]);
        }

        for(int i = 0; i < 6; i++) {
            System.out.println(weight[i]);
        }

    // USING FOR EACH LOOP for printing output multiple times

    for(int age : ages) {
        System.out.println(age);
    }

    // USING WHILE LOOP 

    int i = 0;
    while(i<3) {
        System.out.println(names[i]);
        ++i;
    }
        
     }
}
