package J_OOPs;

class students {

    private String name ;                 // variables should be private
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
public class i_getter_setter {
    public static void main(String[] args) {
    
    students obj = new students();
    obj.setName("YASH GIRISH BHUTADA");            // set the values
    obj.setAge(20);
    System.out.println(obj.getName() + " : " + obj.getAge());        // print the values

    }
    
}


