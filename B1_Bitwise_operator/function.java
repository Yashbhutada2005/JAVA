package B1_Bitwise_operator;

public class function {

    // GET ITH BIT (USING LEFT SHIFT AND ALSO AND(&) FIND VALUE OF BIT)
    public static int getithbit(int n , int i){
        int bitmask =1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else {
            return 1;
        }
    }

    // SET ITH BIT (USING LEFT SHIFT AND ALSO OR(|) TO SET THE BIT)
    public static int setithbit(int n , int i){
        int bitmask = 1<<i;
        return n| bitmask;
    }

    // CLEAR ITH BIT (USING NOT OF LEFT SHIFT (~(1<<I)) ALSO AND(&))
    public static int clearithbit(int n , int i){
        int bitmask = 1<<i;
        return n & bitmask;
    }

    // UPDATE ITH BIT
    public static int updateithbit(int n , int i){
        n = clearithbit(n , i);
    }

    public static void main(String[] args) {
        System.out.println(getithbit(9, 3));
        System.out.println(setithbit(9, 3));
        System.out.println(clearithbit(9, 3));
    }
}
