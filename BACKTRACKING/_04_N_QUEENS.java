public class _04_N_QUEENS {

    public static boolean isSafe(char board[][] , int row , int col ){
        // Check in coloum up 
        for(int i = row-1 , j=col ; i>= 0 ; i-- ){
            if(board[i][j]=='Q'){
                return false ;
            }
        }

        // Check the left diagonal up 
        for(int i = row-1 , j=col-1 ; i>=0 && j >=0 ; i--, j--){

            if(board[i][j]=='Q'){
                return false;
            }

        }

        //Chaeck Right diagonal up 
        for( int i =row-1, j = col+1 ; i>=0 && j<board[0].length ; i--,  j++){

            if(board[i][j]== 'Q'){
                return false;
            }
           
        }
        return true ; 
    }


    public static void NQUEENS2(char board [][], int row){

        // BASE CASE 
        if(row == board.length){
            printBoard(board);
            System.out.println("============CHESS BOARD=================="); 
            return ;
        }

        // WORK
        
        for( int j=0 ; j < board.length; j++){

          if (isSafe(board, row , j )) {

              //place the quuen on the row 
              board[row][j]= 'Q';
              NQUEENS2(board, row+1); // function call 
              board[row][j] ='x'; // backtracking 
            
          }

        }

        // BELIVE IN THE INNER FUNCTION CALL 

    }

    // THIS IS THE SIMPLE NQUEENS METHOD WHICH IS REQUIRED TO PLACE THE QUEENS JUST IN ROWS NOT USING THE SAFETY AND ALL CONDITIONS ONLU WE JUST PLACE THE QUEENS INSIDE THE CHESS BOARD IN ROW WISE 
    public static void NQUEENS(char board[][], int row ){

        // BASE CASE 

        if(row == board.length){
            printBoard(board);
            System.out.println("============CHESS BOARD==================");
            return;
        }

        // WORK 

        for( int j =0 ; j< board.length; j++){
            board[row][j]= 'Q';
            NQUEENS(board, row+1);// belive in the inner function 
            board[row][j]= 'x';
            
        }

        // BELIEVE IN THE INNER FUNCTION CALL 


    }

    public static void printBoard(char board[][]){

        for( int i =0; i< board.length; i++){
            for( int j =0 ; j< board[0].length; j++){

                System.out.print(board[i][j]+"  ");

            }
            System.out.println();
           
        }
    }

    public static void main(String[] args) {
        int n =4 ;
       char board[] [] = new char[n][n];

       for(int i =0 ; i < board.length; i++ ){
        for(int j =0 ; j< board[0].length; j++){
            board[i][j]= 'x';
        }
       }

    //    NQUEENS(board,0); 

    //    System.out.println("THIS IS NQUEENS 2 CALLING ");
       NQUEENS2(board, 0);
        
    }
    
}
