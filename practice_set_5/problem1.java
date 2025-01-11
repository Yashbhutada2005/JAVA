// Create a employee 

package practice_set_5;

public class problem1 {

public static class employee {       // created a class
    int salary;
    String name;

    public int getsalary() {         // function to get salary
        return salary;
    }
    public String getname(){          // function to get name
        return name;
    }
    public void setname(String n){    // function to set name
        name = n;
    }
  
    public static void main(String[] args) {
        
        employee yash = new employee();     // instanciating object

        yash.setname("Yash Bhutada");
        System.out.println(yash.getname());
        yash.salary = 100000;
        System.out.println(yash.getsalary());
    }

    }    
}
