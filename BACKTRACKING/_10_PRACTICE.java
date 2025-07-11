public class _10_PRACTICE {

    public static boolean isSafe(String board[][], int row , int col){

        // Vertical up 
        for(int i=row-1 ; i>=0 ; i--){
            if(board[i][col] == "Q"){
                return false ;
            }
        }

        // diagonallly left 
        for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i-- , j--){
            if(board[i][j] == "Q"){
                return false;
            }
        }

        // diagonally right 
        for(int i=row-1 , j=col+1; i>=0 && j < board[row].length; i--,j++){
            if(board[i][j] == "Q"){
                return false;
            }
        }

        return true;
    }

    public static void NQUEENS(String board[][], int row) {

        // BASE CASE
        if (row == board.length) {
            printArr(board);
            return;
        }

        for (int j = 0; j < board[row].length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = "Q";
                NQUEENS(board, row + 1);
                board[row][j] = "X";
            }
        }
    }

    public static void printArr(String board[][]) {

        System.out.println("============ chess board =============");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;
        String board[][] = new String[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "X";
            }
        }
        NQUEENS(board, 0);
    }

}
