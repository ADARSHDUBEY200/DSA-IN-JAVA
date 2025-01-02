import java.util.Arrays;

public class _01_FINDING_MISSING_REPEATING_NUMBERS {

    public static void main(String[] args) {
        
        int [][] arr = {
            {1, 3, 7},
            {6, 2, 5},
            {4,8,8 }
        };


        for (int i=0; i < arr.length ; i++){
            Arrays.sort(arr[i]);
        }


        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    
}
