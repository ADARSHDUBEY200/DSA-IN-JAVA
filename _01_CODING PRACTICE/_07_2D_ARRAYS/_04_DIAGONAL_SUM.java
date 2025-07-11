public class _04_DIAGONAL_SUM {
    

    // THIS IS THE BRUTE FORCE APPROACH 

    public static int  DiagonalSum(int arr [] []){

        int sum =0 ;

        for(int i=0 ; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){

                if(i==j){
                    sum =sum + arr[i][j];
                }else if(i+j == arr.length-1){
                    sum = sum + arr[i][j];
                }
            }
        }

        return sum ;
    }

    // optimized approach 

    public static int DiagonalSum1(int arr[][]){
        int sum = 0;

        for(int i =0 ; i< arr.length ; i++){

            // primary diagonal sum 
            sum = sum + arr[i][i];

            // secondary diagonal sum 
            if(i != arr.length-1-i){
                sum = sum + arr[i][arr.length-1-i];
            }


        }
        return sum ;
    }
    public static void main(String[] args) {
        
        int arr [] [] ={
            {0,1,2},
            {3,4,5},
            {6,7,8},
        };

       int value = DiagonalSum(arr);
       int value1 = DiagonalSum1(arr);

       System.out.println("THE SUM OF THE DIAGONAL ELEMENTS IS : "+value);
       System.out.println("THE VALUE WITH THE OPTIMIZED APPROACH IS : "+value1);
    }
}
