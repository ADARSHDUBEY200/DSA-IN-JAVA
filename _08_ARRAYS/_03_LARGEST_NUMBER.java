import java.util.Scanner;

public class _03_LARGEST_NUMBER {

    public static void LargestNumber(int arr[]){
        int m =0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>=m){
                m=arr[i];
            }
        }

        System.out.println("THE LARGEST NUMBER OF YOUR GIVEN ARR IS : "+m);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int arr[]=  new int [5];
        for(int i=0; i<= arr.length-1;i++){
            System.out.println("ENTER THE VALUE OF"+i+"th INDEX OF YOUR ARRAY");
             arr[i]=sc.nextInt();

        }

        LargestNumber(arr);
    }
    
}
