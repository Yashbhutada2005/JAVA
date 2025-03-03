package PROJECT;

public class Sudoku {

    public static boolean isSafe(int Sudoku[][] , int row , int col , int digit){
        // coloumn , checks if digit exisit in col or not
        for(int i = 0 ; i<=8 ; i++){
            if(Sudoku[i][col] == digit){
                return false ;
            }
        }

        // row , checks if digit exisit in row or not
        for(int j = 0; j<=8; j++){
            if(Sudoku[row][j] == digit){
                return false ;
            }
        }

        // grid , checks if digit exisit in grid or not
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        // 3x3 ways
        for(int i = sr ; i <sr+3 ; i++){
            for(int j = sc ; j < sc+3 ; j++){
                if(Sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean SudokuSolver(int Sudoku[][] , int row , int col){
        // base case 
        if(row == 9 && col == 0){  // row 9 is last+1 row , means above all rows are sorted
            return true ;
        }
    
        // recursion
        int nextRow = row , nextCol = col+1 ;  
        if(col+1 == 9){
            nextRow = row+1 ; 
            nextCol = 0;
        }

        // means current cell is already fillled we move to next cell
        if(Sudoku[row][col] != 0){
            return SudokuSolver(Sudoku, nextRow, nextCol);
        }

        for(int digit= 0 ; digit <= 9 ; digit++){
            if(isSafe(Sudoku , row , col , digit)){
                Sudoku[row][col] = digit ;
                if(SudokuSolver(Sudoku, nextRow, nextCol)){
                    return true ;
                }
                Sudoku[row][col] = 0 ;
            }
        }
        return false ;
    }

    public static void printSudoku(int Sudoku[][]){
        for(int i = 0; i <9 ; i++) {
            for(int j = 0; j < 9; j++){
                System.out.print(Sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int Sudoku[][] =  {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
            };

        if(SudokuSolver(Sudoku, 0, 0)){
            printSudoku(Sudoku);
        }
        else {
            System.out.println("Solution not exist , Sorry !!");
        }
    }
}
