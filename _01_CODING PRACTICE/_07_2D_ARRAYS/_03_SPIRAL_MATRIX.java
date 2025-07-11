public class _03_SPIRAL_MATRIX {

    public static void SpiralMatrix(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while ((startRow <= endRow) || (startCol <= endCol)) {
            // PRINT THE START ROW
            for (int i = startRow; i <= endCol; i++) {
                System.out.print(arr[startRow][i]+" ");
            }

            // PRINT THE ENDCOLOUMN

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol]+" ");
            }

            // PRINT THE ENDROW

            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(arr[endRow][i]+" ");
            }

            // PRINT THE STRATING COLOUMN

            for (int i = endRow - 1; i >= startRow +1; i--) {
                System.out.print(arr[i][startCol]+" ");

            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        SpiralMatrix(arr);
    }

}
