public class _06_SUDOKU {

    public static boolean sudokuSolver(int sudoku[][], int row , int col){
        // BASE CASE 

        if (row == 9 && col == 9) {

            return true;
            
        }else if ( row ==9 ){
            return false ;
        }

        // RECURSION CALL(WORK TO DO ) 

        if(col== sudoku[0].length){
            row = row+1;
            col =0;
        }

        for(int digit =1 ; digit<=9 ; digit++){

            if(isSafe(sudoku, row , col , digit)){
                sudoku[row][col] = digit ;
            }

            if (sudokuSolver(sudoku, row, col+1)) { // SOLUTIONS EXISTS 
                return true ;
            }

            sudoku[row][col] = 0;
        }

        return false ;

        // BELIVE IN THE INNER FUCTION WE CALLED  
    }

    public static void main(String[] args) {
        
        int sudoku [][] = {
            {0,0,8,0,0,0,0,0,0},

            {4,9,0,1,5,7,0,0,2},

            {0,0,3,0,0,4,1,9,0},

            {1,8,5,0,6,0,0,2,0},

            {0,0,0,0,2,0,0,6,0},

            {9,6,0,4,0,5,3,0,0},

            {0,3,0,0,7,2,0,0,4},

            {0,4,9,0,3,0,0,5,7},

            {8,2,7,0,0,9,0,1,3},
            
        };
    }
    
}
