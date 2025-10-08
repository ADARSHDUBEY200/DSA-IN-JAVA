import java.util.Scanner;

public class _05_REVERSE_ARRAY {

    public static void REVERSEARRAY(int arr[]){
        int start=0; int end = arr.length-1;

        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start=start+1;
            end=end-1;
        }

        
    }
    public static void main(String[] args) {
        
        // Scanner sc= new Scanner(System.in);
        int arr[] = {2,4,6,8,10,12,14};
        System.out.println("VALUE OF ARRAYS BEFORE REVERSING THE ARRAY");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("VALUE AT INDEX "+i+" IS : " +arr[i]);
        };

        REVERSEARRAY(arr);

        System.out.println("VALUE OF THE ARRAY AFTER REVERSING OF THE ARRAY IS ");

        for(int i=0;i<=arr.length-1;i++){
            System.out.println("VALUE AT INDEX "+i+" IS : " +arr[i]);
        };

        
    }
    
}
