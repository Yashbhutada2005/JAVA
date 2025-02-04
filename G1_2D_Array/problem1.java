package G1_2D_Array;
import java.util.*;

public class problem1 {
    public static void search(int[][] matrix, int key) {
        int n = matrix.length, m = matrix[0].length;

        // Searching for the key in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at position: (" + i + ", " + j + ")");
                    return;  // Exit once found
                }
            }
        }
        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        search(matrix, key);  // Call the search function with the matrix and key
        sc.close();  // Close the scanner
    }
}
