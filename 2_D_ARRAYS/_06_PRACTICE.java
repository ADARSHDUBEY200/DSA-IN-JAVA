public class _06_PRACTICE {

    public static int  SearchingPlusSum(int numbers[][]){

        int count =0;

        for(int i=0;i<=numbers.length-1;i++){
            for(int j=0;j<=numbers[0].length-1;j++){
                if (numbers[i][j]==7) {

                    count ++;

                    
                }

            }
        }

        return count ;

    }
    public static int SecondRowSum(int numbers[][]){

        int sum =0;
        int row=1;
        int col=0;

        while(col<=numbers.length-1){
            sum+=numbers[row][col];
            col++;
        }


        // for(int i=1;i==1;i++){
        //     for(int j=0;j<=numbers.length-1;j++){
        //         sum+=numbers[i][j];

        //     }
        // }
        return sum;
    }

    public static void TransposeMatrix(int numbers [][]){

        int transpose[][]= new int [numbers[0].length][numbers.length];


        for(int i=0;i<=numbers.length-1;i++){
            for(int j=0;j<=numbers[0].length-1;j++){
              transpose[j][i]=numbers[i][j];
            }
        }

        //PRINTING OF THE TRANSPOAE MATRIX 
         for (int i=0;i<=transpose.length-1;i++){
            for(int j=0;j<=transpose[0].length-1;j++){
                System.out.print(transpose[i][j]);
            }
            System.out.println();
         }
    }

    public static void main(String[] args) {
        
        int numbers [][]={
            {1,3,4,7},
            {2,4,7,6},
            {5,6,7,8},
            
        };

        int count =SearchingPlusSum(numbers);
        int sum = SecondRowSum(numbers);

        TransposeMatrix(numbers);
        System.out.println("Total numbers of the seven's is : "+count);
        System.out.println("THE SUM OF THE SECOND ROW OF THE ARRAY IS : "+sum);

        // for(int i=0;i<=numbers.length-1;i++){
        //     for(int j=0;j<=numbers[0].length-1;j++){
        //         System.out.print(numbers[i][j]);
        //     }
        //     System.out.println();
        // }

        // System.out.println(numbers.length);
        // System.out.println(numbers[0].length);
    }

    
    
}
