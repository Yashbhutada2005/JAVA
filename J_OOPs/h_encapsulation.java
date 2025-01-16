package J_OOPs;

class students {

    private String name ;
    private int age;

    public String getName()
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
    obj.setName("YASH BHUTADA");
    obj.setAge(20);
    System.out.println(obj.getName() + " : " + obj.getAge());

    }
    
}
