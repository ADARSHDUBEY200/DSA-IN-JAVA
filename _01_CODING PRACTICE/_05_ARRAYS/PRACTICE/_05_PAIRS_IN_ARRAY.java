
public class _05_PAIRS_IN_ARRAY {

    public static void PairsInArray(int arr []){

        for(int i=0 ; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){

                System.out.print("(");
                System.out.print(arr[i]+","+arr[j]+","+(arr[i]+arr[j]));
                System.out.print(")");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int arr [] = {2,4,6,8,10};
        PairsInArray(arr);
    }
    
}
