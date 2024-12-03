import java.util.*;

public class _07_SUB_ARRAY {
    public static void main(String[] args) {
        
        int arr[]={2,4,6,8,10};
        int total=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i;j<=arr.length-1;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                  
                   
                }
                if(max<=sum){
                    max=sum;
                }
                if(min>=sum){
                    min=sum;
                }
                System.out.println();
                System.out.print(" THE SUM OF THE SUBARRAY IS : "+ sum);
                total++;
                System.out.println();
                sum=0;

               
                
            }
        }
        System.out.println("THE TOTAL NUMBER OF THE SUBARRAYS ARE : "+total);
        System.out.println("THE MAXIMUM VALUE OF THE SUM OF THE SUBAARAYS IS : "+ max);
        System.out.println(" THE MINIMUM VALUE OF THE SUBAARAY IS :"+ min);
    }
    
}
