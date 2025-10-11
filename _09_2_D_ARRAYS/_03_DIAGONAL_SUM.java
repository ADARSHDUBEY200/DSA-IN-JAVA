public class _03_DIAGONAL_SUM {


    public static void DIAGONAL_SUM(int arr [][]){
        int sum=0;
        
// ====================== BRUTE FORCE METHOD ========================================================

        // for(int i=0;i<=arr.length-1;i++){
        //     for(int j=0;j<=arr[0].length-1;j++){

        //         //PRIMARY DIAGONAL
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }

        //         //SECONADARY DIAGONAL

        //         if (i+j==arr.length-1) {
        //             sum+=arr[i][j];
                    
        //         }


        //     }
        // }
        // System.out.println("the sum of the diagonal elemrmt is : "+sum);


// ========================== COMPLEXITY OF O(N)=====================================================

    for(int i=0;i<=arr.length-1;i++){

        //primary digonal
        sum+=arr[i][i];

        //secondary diagonal
        if(i!=arr.length-i-1){
            sum+=arr[i][arr.length-i-1];
        }
        

    }

    System.out.println("the sum of the diagonal elemets of the array is not brute force  : "+sum);
}

    public static void main(String[] args) {
        
        int [][] arr={
               {1,2,3,4}, 
               {5,6,7,8},
               {9,10,11,12}, 
               {13,14,15,16}
        };
        
        // BASICALLY THE CONCEPT IS THAT FOR THE PRIMARY DIAGONAL==> i=j means rows and coloumns are equals for that element in the primary diagonal 

        // BASICALLY IN THE SECONDARYY DIAGONAL SUM OF THE ROWS AND COLOUMNS IS EQUAL TO NUMBER OF NO. OF THE  IN THE ARRAY . SO IF WE SAY THET  i+j=n-1

        DIAGONAL_SUM(arr);
    };

};
