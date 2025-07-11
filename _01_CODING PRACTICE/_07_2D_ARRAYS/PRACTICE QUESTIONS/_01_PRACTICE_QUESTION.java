
public class _01_PRACTICE_QUESTION {

    public static int Finding(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }

        return count ;
    }

    public static int Sum(int arr[][]){
        int sum =0 ;

       for(int i=0; i< arr[0].length; i++){
        sum= sum+ arr[1][i];
       }

       return sum ;

    }

    public static void main(String[] args) {
        
        int matrix [][] = {
            {4,7,8},
            {8,8,7}
        };
        int key =7 ;

        int value = Finding(matrix,key);
        int value1 = Sum(matrix);
        System.out.println("THE NUMBER OF THE TIMES KEY REPEATED IS : "+value);
        System.out.println("THE SUM OF THE SECOND ROW IS : "+value1);
    }

}
