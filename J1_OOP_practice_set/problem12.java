// AGGREGATION

package J1_OOP_practice_set ;

class Address {
    String city , state , country;

    Address(String city , String state , String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void display(){
        System.out.println(city + ", " + state + ", " + country);
    }
}

class Employee {
    int id;
    String name;
    Address address;

    Employee(int id , String name , Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Address : " + address);
    }
}
public class problem12 {
    public static void main(String[] args) {
        Address address = new Address("Pune", "Maharashtra", "India");

        Employee employee = new Employee(52, "Yash Bhutada", address);

        employee.display();
    }
    
}
