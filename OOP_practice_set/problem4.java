// class car with multiple attributes (Encapsulation) using getter and setter 

package OOP_practice_set;

class car{
    private String brand;
    private String model;
    private int year;

    //CONSTRUCTOR
    public car(String brand , String model , int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // GETTER FOR BRAND
        public String getBrand(){
            return brand;
        }

    // SETTER FOR BRAND
        public void setBrand(String brand){
            this.brand = brand;
        }

    // GETTER FOR MODEL
        public String getModel(){
            return model;
        }

    // SETTER FOR MODEL
        public void SetName(String model){
            this.model = model;
        }

    // GETTER FOR YEAR
        public int getYear() {
            return year;
        }

    // SETTER FOR YEAR
        public void setYear(int year ) {
            this.year = year;
        }
}

public class problem4 {

    public static void main(String[] args) {
        
        car Car = new car("Lamborgini", "Hurricane", 1932);

        // CAR DETAIL 1
        System.out.println("Car detail :");
        System.out.println("Brand : " + Car.getBrand());
        System.out.println("Model : " + Car.getModel());
        System.out.println("Year : " + Car.getYear());
        System.out.println();

        // MODIFY
        Car.setBrand("Konisegg");
        Car.SetName("Ageraa");
        Car.setYear(1787);

        // CAR DETAILS 2
        System.out.println("Car Details :");
        System.out.println("Brand : " + Car.getBrand());
        System.out.println("Model : " + Car.getModel());
        System.out.println("Year : " + Car.getYear());
    }
    
}
