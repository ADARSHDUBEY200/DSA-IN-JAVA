public class _05_PRACTICE {

    public static void Spiral(int numbers[][]) {

        int startRow = 0;
        int EndRow = numbers.length - 1;
        int StartCol = 0;
        int EndingCol = numbers[0].length - 1;

        while (startRow <= EndRow && StartCol <= EndingCol) {

            // Starting Row  ----------> starting row++

            
                for (int j = StartCol; j <=EndingCol; j++) {
                    System.out.print(numbers[startRow][j]+" ");
                   
                }
            

            // Ending coloumn -----------> ending coloum--

          
                for (int j = startRow+1; j <=EndRow; j++) {
                    System.out.print(numbers[j][EndingCol]+" ");
                    
                }
           

            // Ending Row ----------> ending row--

          
                for (int j = EndingCol-1; j >= StartCol; j--) {
                    System.out.print(numbers[EndRow][j]+" ");
                  
                }
            

            // Starting coloumn-----------> starting col++

            
                for (int j = EndRow-1; j>=startRow+1; j--) {
                    System.out.print(numbers[j][StartCol]+" ");
                   
                }

                startRow++;
                EndingCol--;
                EndRow--;
                StartCol++;
            
        }

    }

    public static void main(String[] args) {

        int numbers[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };

        Spiral(numbers);

    }

}
