// CONSTRUCTOR AND OVERLOADING

package OOP_practice_set;

class box {
    private int length , width , height;

    //FOR CUBE
        public box(int side ){
            this.length = this.width = this.height = side;
        }

    //FOR RECTANGLE
        public box(int length , int width , int height){
            this.length = length;
            this.width = width;
            this.height = height;
        }

        public int getVolume(){
            return length * height * width;
        }
}
public class problem10 {

    public static void main(String[] args) {
        
        box cube = new box(23);
        box rectangle = new box(23, 12, 9);

        System.out.println("Volume of Cube : " + cube.getVolume());
        System.out.println("Volume of Rectangle : " + rectangle.getVolume());
    }
    
}
