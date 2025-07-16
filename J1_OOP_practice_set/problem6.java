//ENCAPSULATION
// PRACTICE ON GETTER AND SETTER METHODS

package J1_OOP_practice_set ;

class Student {
   private String name;
    private int Rollnumber;

    // GETTER AND SETTER FOR NAME
     public String getName(){
        return name;
     }
     public void setName(String name){
        this.name = name;
     }

     // GETTER AN SETTER FOR ROLL NUMBER
     public int getRollnumber(){
        return Rollnumber;
     }
     public void setRollnumber(int Rollnumber){
        this.Rollnumber = Rollnumber;
     }
}
public class problem6 {
    public static void main(String[] args) {
        
        // SET NAME
        Student student = new Student();
        student.setName("Yash Bhutada");
        student.setRollnumber(52);

        // CALL NAME
        System.out.println("Student name : " + student.getName());
        System.out.println("Roll number : " + student.getRollnumber());
    }
    
}
