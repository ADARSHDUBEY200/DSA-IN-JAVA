public class _08_PRACTICE {

    // public static int InversionCount(int arr []){
    //     int count =0 ;

    //    for(int i=0 ; i<arr.length-1 ; i++){

    //     for( int j=i+1 ; j<arr.length-1; j++){

    //         if(arr[i] > arr[j]){
    //             count++;
    //         }

    //     }
    //    }

    //    return count ;

    // }

    public static int InversionCount(int arr[], int curr){

        // BASE CASE 

        // WORK 

        for(int i=curr ; i<arr.length;i++){
            if(arr[curr] > arr[curr+1])
        }

        // BELIVE IN THE INNER FUNCTION CALL 

    }

    public static void main(String[] args) {

        int arr [] = {2,3,4,5,6};
        
        int value = InversionCount(arr);
        System.out.println("THE INVERSION COUNT OF THIS ARRAY IS : "+value );
    }
    
}
