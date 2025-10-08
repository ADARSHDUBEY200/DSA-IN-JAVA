import java.util.*;

public class _08_MAX_SUBARRAY {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int arr[]=new int[5];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("ENTER THE "+i+"th INDEX OF THIS ARRAY");
             arr[i]=sc.nextInt();
        }

        System.out.println("THE ARRAY WHICH IS GIVEN BY YOU IS : ");

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int sum=0;
        int max= Integer.MIN_VALUE;

        for(int i=0;i<=arr.length-1;i++){
            int start=i;
            for(int j=i;j<=arr.length-1;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                if(max<=sum){
                    max=sum;
                }
                System.out.println();
                System.out.println("THE VALUE OF THE SUM OF THIS SUBAARAY IS : "+sum);
                sum=0;
            }
        }
        System.out.println("THE MAXIMUM VALUE OF THE SUBARRAY IS : "+max);

    }
    
}
