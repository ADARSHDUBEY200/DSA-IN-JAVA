public class _10_PRACTICE {

    public static void PrintArray( int arr []){

        for ( int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }

    public static void ReverseArray(int arr []){

        int low =0 ;
        int high = arr.length-1 ;


        while (low <= high ){
            
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high]= temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        
        int arr [] = {1,2,3,4,5,6};

        ReverseArray(arr);

        PrintArray(arr);
    }
    
}
