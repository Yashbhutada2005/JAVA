package J_OOPs;

public class d_Accesss_modifier {
    
   public static class example {

        private int b = 123;       // private varible 
        private int sum = b+ 21;

        int d = 12345;     // default access

        protected String names = "karthik , sahil";

        public int a = 12;          // public variable 
        public String name = "Yash";

        public void Displayinfo() {   // public method
            System.out.println("Your name is " + name + " roll no . " + a);
        }

        private void dislplayinfo(){   // private method
            System.out.println(b + sum);
        }

        void info() {          // default method
            System.out.println(d);
        }

        protected void Info() {
            System.out.println(names);
        }

    }
    public static void main(String[] args) {

    example yash = new example();

    yash.Displayinfo();

    example sahil = new example();

    sahil.dislplayinfo();

    example smit = new example();

    smit.info();
    smit.Info();
    }
    
}
