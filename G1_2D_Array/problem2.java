// SUM OF DIAGONAL OF MATRIX
package G1_2D_Array;
public class problem2 {
    public static int sum( int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if(i != matrix.length-1-i){   // matrix.lenght-1-i = j (secondary diagonal)
                sum += matrix[i][matrix.length-1-i];  // cause if matrix is 3x3 then the middle element will not be repeated
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                           {9,10,11,12},
                          {13,14,15,16}};

    System.out.println(sum(matrix));
            
    }
}
