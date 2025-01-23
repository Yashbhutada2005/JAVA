//PRINT A NUMBER FROM 1,2....,10

package K_Recursion;

public class problem2 {

    public static void inc(int n){   // METHOD DECLARATION - MEANS IT IS DECLARED AS "PUBLIC STATIC" MEANING IT CAN BE CALLED WITHOUT CREATING OBJECT
        if(n == 1){          // BASE CASE - IF "N" IS 1 IT WILL RETURN N+" "
            System.out.print(n+" ");
            return;
        }
        inc(n-1);
        System.out.print(n+" ");
    }
        public static void main(String args[]){
            int n=10;
            inc(n);
        }
}
