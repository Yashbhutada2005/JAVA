package G_Array;
public class basics {
    public static void main(String[] args) {

    // basics of array's
        int ages[] = new int[3];
        String[] names = new String[3];
        
        ages[0] = 12;
        ages[1] = 14;
        ages[2] = 34;

        names[0] ="yash";
        names[1] ="smit";
        names[2] ="devanshu";

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        float[] weight = {44,66,88,98,54};

        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        System.out.println(weight[3]);
        System.out.println(weight[4]);

    // length of array's (array.length)
        System.out.println(ages.length);
        System.out.println(weight.length);
        System.out.println(names.length);

    }
    
}
