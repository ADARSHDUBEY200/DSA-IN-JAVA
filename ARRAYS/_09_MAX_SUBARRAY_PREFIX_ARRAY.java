import java.util.Scanner;

public class _09_MAX_SUBARRAY_PREFIX_ARRAY {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int arr[]=new int[5];
        int prefix[]=new int[5];

        for(int i=0;i<=arr.length-1;i++){
            System.out.println("ENTER THE VALUE OF THE "+i+" INDEX OF THE ARRAY");
            arr[i]=sc.nextInt();

        }
        System.out.println("YOUR ENTERED GIVEN ARRAY IS : ");

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int sum=0;
        int max=Integer.MIN_VALUE;
         prefix[0]=arr[0];

        for(int i=1;i<=prefix.length-1;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        System.out.println("YOUR PREFIX ARRAY OF THE GIVEN ARRAY IS : ");

        for(int i=0;i<=prefix.length-1;i++){
            System.out.print(prefix[i]+" ");
        };

        System.out.println();

        for(int i=0;i<=arr.length-1;i++){
            int start=i;
            for(int j=i;j<=arr.length-1;j++){
                int end =j;
                sum = i== 0 ? prefix[end]:prefix[end]-prefix[start-1];
                
                if(max<=sum){
                    max=sum;
                }

                sum=0;
                
            }
        }
        System.out.println("THE MAXIMUM VALUE OF YOU ALL SUBBARY VALUE SUM IS : "+max);

    }
    
}
