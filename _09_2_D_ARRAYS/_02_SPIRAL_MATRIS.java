import java.util.Scanner;

public class _02_SPIRAL_MATRIS {

    public static void SPIRAL(int arr[][]){
       int startRow=0;
       int endRow=arr.length-1;
       int startCol=0;
       int endCol=arr[0].length-1;

        while(startRow<=endRow && startCol<=endCol){

        //PRINTING OF THE TOP   ---->STARTING ROW
        for(int i=startCol;i<=endCol;i++){
            System.out.print(arr[startRow][i]+" ");
        }
      
        //PRINTING OF THE RIGHT------>ENDING COLOUMN

        for(int i=startRow+1;i<=endRow;i++){
            System.out.print(arr[i][endCol]+" ");
        }
       
        //PRINTING OF THE BOTTOM------>ENDING ROW

        for(int i=endCol-1;i>=startCol;i--){
            System.out.print(arr[endRow][i]+" ");
        }
       
        //PRINTING OF THE LEFT-------->STARTING COLOUMN
        for(int  i=endRow-1;i>=startRow+1;i--){
            System.out.print(arr[i][startCol]+" ");
        }

        startRow++;
        endCol--;
        endRow--;
        startCol++;

      
    }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //INTILIZATION OF THE ARRAY
        int arr[][]=new int[4][4];

        //TAKING INPUT OF THE ARRAY
        System.out.println("ENTER THE VALUES OF THE ELEMENT OF YOUR ARRAY: ");

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                System.out.println("ENTER THE VALUE OF"+"("+i+","+j+")"+ "INDEX OF YOUR 2-D ARRAY IS ");
                arr[i][j]=sc.nextInt();
            }
        }

        //PRINTING THE OUTPUT OF THE ARRAY

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //SPIRAL MATRIS FORM TO PRINT THE ARRAY SO FOR THIS THE SPIRAL FUNCTION IS THERE

        SPIRAL(arr);
    }
    
}
