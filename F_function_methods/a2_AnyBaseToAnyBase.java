    package F_function_methods;

    import java.util.*;

    public class a2_AnyBaseToAnyBase {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number :");
            int n = sc.nextInt();
            System.out.println("Enter the Source Base :");
            int sb = sc.nextInt();
            System.out.println("Enter the Destination Base :");
            int db = sc.nextInt();

            int DecimalValue = AnyBaseToDecimal(n , sb);
            int ConvertedValue = DecimalToAnyBase(DecimalValue , db);

            System.out.println(ConvertedValue);
            sc.close();
        }

        public static int AnyBaseToDecimal(int n , int sb){
            int ans = 0;
            int p = 1;
            while(n > 0){
                int rem = n % 10;
                n = n / 10;
                ans += rem * p;
                p *= sb;
            }
            return ans;
        }
        public static int DecimalToAnyBase(int DecimalValue , int db){
            int ans = 0;
            int p = 1;
            while(DecimalValue > 0){
                int rem = DecimalValue % db;
                DecimalValue = DecimalValue / db;
                ans += rem * p;
                p *= 10;
            }
            return ans;
        }

    }
