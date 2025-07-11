public class _08_KADANES_ALGORITHM {

    public static int KadanesAlgorithm(int arr []){
        int currSum =0 ;
        int max = Integer.MIN_VALUE;

        for(int i =0 ; i< arr.length ; i++){

            int sum = currSum + arr[i];
            System.out.println("THE SUM IS : "+sum);

            if(sum < 0){
                currSum = 0;
            }else{

                currSum = sum ;

                if(max < sum ){
                    max = sum ;
                }

            }
            System.out.println("THE CURRSUM IS : "+currSum);
        }

        return max;
    }

    public static void main(String[] args) {
        
        int arr [] = {1,-2,6,-1,3};
        int value = KadanesAlgorithm(arr);
        System.out.println("THE MAXIMUM SUM OF THE SUBARRAY IS : "+value);
    }
    
}
