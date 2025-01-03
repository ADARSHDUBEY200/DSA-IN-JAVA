public class _01_PRACTICE {

    public static void SpiralMatrix(int arr[][]) {

        int startRow = 0;
        int EndingColoumn = arr[0].length - 1;
        int EndingRow = arr.length - 1;
        int StartColoumn = 0;

        while ((startRow <= EndingRow) || (StartColoumn <= EndingColoumn)) {

            // TOP ROW --------------> FROM LEFT TO RIGHT

            for (int i = StartColoumn; i <= EndingColoumn; i++) {
                System.out.print(arr[startRow][i] + " ");
            }

            // ENDING COLOUMN ---------------> FROM TOP TO DOWN

            for (int i = startRow + 1; i <= EndingRow; i++) {

                System.out.print(arr[i][EndingColoumn] + " ");
            }

            // ENDING ROW --------------------> FROM RIGHT TO LEFT

            for (int i = EndingColoumn - 1; i >= StartColoumn; i--) {
                System.out.print(arr[EndingRow][i] + " ");
            }

            // STARTING COLOUMN ----------------> FROM BOTTOM TO UP

            for (int i = EndingRow - 1; i > startRow; i--) {
                System.out.print(arr[i][StartColoumn] + " ");
            }

            startRow++;
            StartColoumn++;
            EndingColoumn--;
            EndingRow--;

        }

    }

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        SpiralMatrix(arr);
    }

}
