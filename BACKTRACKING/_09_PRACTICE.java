public class _09_PRACTICE {

    public static void NQUEENS(String board [][] , int row){

        // BASE CASE 
        if(row == board.length){
            printBoard(board);
            return;
        }

        // WORK 
        for(int j=0 ; j<board[row].length;j++){
            board[row][j] = "Q";
            NQUEENS(board, row+1);
            board[row ][j] = "X";// backtracking step
        }

        // BELEIVE INNER FUNCTION CALL 
    }

    public static void printBoard(String board [][]){
        System.out.println("============= chess board ===============");
        for(int i=0 ; i<board.length;i++){
            for(int j=0 ; j<board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 2 ;
        String board [] [] = new String[n][n];

        // initalize the board 
        for(int i=0 ; i<board.length; i++){
            for(int j=0 ; j<board[i].length;j++){
                board[i][j] ="X";
            }
        }
        NQUEENS(board,0);
    }
    
}
