import java.util.Scanner;

public class _10_KADANES_S_ALGORITHMS {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[8];

        for(int i=0;i<=arr.length-1;i++){
            System.out.println("ENTER THE VALUE OF THE "+i+" th INDEX VALUE");
            arr[i]=sc.nextInt();

        }
        System.out.println("YOUR ENTERD ARRAY IS : ");
        System.out.print("[");

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

        boolean isNegative=false;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<0){
                isNegative=true;
            }else{
                isNegative=false;
                break;
            }
        };

        System.out.println("THE VALUE OF IS NEGATIVE IS : "+isNegative);

        if(isNegative){
            int beMax=Integer.MIN_VALUE;
            for(int i=0;i<=arr.length-1;i++){
                if(beMax<arr[i]){
                    beMax=arr[i];

                }

            }

            System.out.println("THE MAXIMUM SUM OF YOUR GIVEN ARRAYS SUBAARAY IS : "+beMax);
        }else{

            int sum=0;
            int max=Integer.MIN_VALUE;
    
            for(int i=0;i<=arr.length-1;i++){
                sum=sum+arr[i];
                if(sum<0){
                    sum=0;
                }
    
                if(max<sum){
                    max=sum;
                }
            }
            System.out.println("SO THE LARGEST SUM OF THE SUBARRAY IS : "+max);
        }
        

        }

      
}
