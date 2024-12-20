package operators;

public class logical {
    public static void main(String[] args) {
        // logical AND operator (&&)
        System.out.println((3>2) && (4>3));
        System.out.println((2>3) && (5>8));
        // used to check the relation between the relational operator

        // logical OR operator (||)
        System.out.println((3==3) || (6>3));
        System.out.println((9==7) || (5>3));
        System.out.println((3==8) || (9<7));

        // logical NOT operator (!)
        System.out.println(! (3==3));
        System.out.println(! (3>8));
    }
}
