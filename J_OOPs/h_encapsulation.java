package J_OOPs;

    /* ENCAPSULATION */   // it is binding method and data together in single class (variables as private)

class students {

    private String name ;                 // variables should be private
    private int age;

    public String getName()               // use of getter and setter methods
     {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }

}
public class h_encapsulation {

    public static void main(String[] args) {
    
    students obj = new students();
    obj.setName("YASH BHUTADA");            // set the values
    obj.setAge(20);
    System.out.println(obj.getName() + " : " + obj.getAge());        // print the values

    }
    
}
