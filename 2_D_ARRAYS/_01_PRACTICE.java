import java.util.Scanner;

public class _01_PRACTICE {

    // NOW WE SEARCH THE ITEMS IN OUR MATRIX WHICH 2-D MATRIX

    public static void SEARCH(int matrix[][], int key) {
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {

                if (matrix[i][j] == key) {
                    System.out.println("your Given key is found ");
                    System.out.println("key at" + "(" + i + "," + j + ")");
                    return;

                }
            }
        }

        System.out.println("YOUR KEY IS NOT FOUND ");
    }
    // FINDING THE MAXIMUM AND THE MINIMUM KEY INSIDE THE ARRAY

    public static void MAXandMIN(int matrix[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<=matrix.length-1;i++){
            for(int j=0;j<=matrix[0].length-1;j++){

                //FINDIND MAX NUMBER 

                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }

                //FINDING THE MINIMUM VALUE

                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }

            }
        }
        System.out.println("THE MAXIMUM VALUE INSIDE THE MATRIX IS : : "+max);

        System.out.println("THE MINIMUM VALUE INSIDE THE MATRIX IS :"+min);
    }

    public static void main(String[] args) {

        int matrix[][] = new int[4][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Now you need to enter the data in the matrix");

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                System.out.println("ENTER THE" + "(" + i + "," + j + ")" + "CELL OF YOUR MATRIX");
                matrix[i][j] = sc.nextInt();

            }
        }

        // NOW WE NEED TO OUTPUT THE DATA PF OUR MATRIX

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("ENTER THE KEY YOU WANT TO FOUND IN THE MATRIX");

        int key = sc.nextInt();
        // System.out.println(matrix.length);
        // System.out.println(matrix[0].length);1

        SEARCH(matrix, key);
        MAXandMIN(matrix);

    }
}