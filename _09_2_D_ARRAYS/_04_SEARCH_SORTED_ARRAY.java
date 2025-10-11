import java.util.Scanner;

public class _04_SEARCH_SORTED_ARRAY {

    public static void SORTED(int arr[][],int key){
        int m=arr[0].length-1;
        int n=0;

        while(n<=arr.length-1 && m<=arr[0].length-1&& m>=0){
            if (key<arr[n][m]){
                m--;
             }else if(key> arr[n][m]){
                n++;
             }
        };

        if(n>arr.length-1 || m<0){
            System.out.println("YOUR  ELEMENT IS NOT FOUND ");
        }else{
            System.out.println("YOUR KEY IS AT INDEX : " +"("+n+","+m+")");

        }

        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE KEY YOU WANT TO FIND OUT INSIDE THE ARRAY");
        int key = sc.nextInt();
        int [][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

       
        SORTED(arr,key);
    }

   
    
}
