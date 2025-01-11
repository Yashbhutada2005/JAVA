// class cellphone
package practice_set_5;

public class problem2 {
    
public static class cellphone {
    public void ring(){
        System.out.println("Ringing......");
    }
    public void vibrate(){
        System.out.println("Vibrating......");
    }
}
    public static void main(String[] args) {

        cellphone S21 = new cellphone();
        
        System.out.println("Papa Calling");
        S21.ring();
        System.out.println("Freind calling");
        S21.vibrate();
    }
}
