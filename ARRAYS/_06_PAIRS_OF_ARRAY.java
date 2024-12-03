public class _06_PAIRS_OF_ARRAY {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int count =0;
        System.out.println("SO THE PAIRS OF YOUR ARRAY IS : ");
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1; j<=arr.length-1;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println();
            
    }
    System.out.println("TOTAL NUMBER OF PAIRS IS : "+count );
    }
    
}
