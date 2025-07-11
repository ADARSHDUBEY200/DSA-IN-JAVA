
public class _06_SUBARRYS {

    public static void PrintSubarrays(int arr[]){

        int count = 0;
        int max = Integer.MIN_VALUE;


        for(int i =0 ; i<arr.length ; i++){
            int start= i ;
            for(int j =i; j< arr.length ; j++){
                int end = j ;
                int sum =0 ;
                System.out.print("[");
                for(int k =start ; k<= end ; k++){
                   
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }

                count++;
                if(max < sum ){
                    max = sum ;
                }

                System.out.println("]");
                System.out.println("THE SUM IS : "+sum );

            }
        }

        System.out.println("THE MAXIMUM SUM OF THE SUBARRAY IS : "+max );

        System.out.println("THE TOTAL SUBARRYS IS : "+count);
    }

    public static void main(String[] args) {
        
        int arr [] =  { 1, -2, 6, -1, 3 };
        PrintSubarrays(arr);
    }
    
}
