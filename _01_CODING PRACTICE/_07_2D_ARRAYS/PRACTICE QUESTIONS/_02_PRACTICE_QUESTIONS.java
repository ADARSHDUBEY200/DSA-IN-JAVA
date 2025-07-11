
public class _02_PRACTICE_QUESTIONS {

    public static void TransposeMatrix(int arr [][]){
        int Transpose [][] = new int[arr[0].length][arr.length];

        for(int i =0 ; i<arr.length; i++){
            for(int j =0 ; j< arr[0].length ; j++){
                Transpose[j][i] = arr[i][j];
            }
        }

        for(int i =0 ; i<Transpose.length;i++){
            for(int j =0 ; j< Transpose[0].length; j++){
                System.out.print(Transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int arr [][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        TransposeMatrix(arr);
    }
    
}
