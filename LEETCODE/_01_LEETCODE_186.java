import java.util.*;

public class _01_LEETCODE_186 {
    public static void main(String[] args) {

        int arr[]={-1,100,3,99};
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF THE TARGET : ");
        int k=sc.nextInt();
        int start=1;
        int l=0;
        int r=arr.length-1;

       while(start<=k){

        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        start++;
        l++;
        r--;


       }

       System.out.println("YOUR ARRAY AFTER THE REVERSING OF THE ARRAY");
       System.out.print("[");

       for(int i=0;i<=arr.length-1;i++){

        System.out.print(arr[i]+" ");

       }
       System.out.println("]");

       int begin=0;
       int end=k-1;

       while(begin<end){
        int temp=arr[begin];
        arr[begin]=arr[end];
        arr[end]=temp;
        begin++;
        end--;
       }

       int l1=k;
       int r1=arr.length-1;


      
        while(l1<r1){
           int temp =arr[l1];
           arr[l1]=arr[r1];
           arr[r1]=temp;

           l1++;
           r1--;
      }

      System.out.println("NOW THE FINAL ARRAY AFTER ROTATION OF YOUR ARRAY");

      System.out.print("[");

      for(int i=0;i<=arr.length-1;i++){
        System.out.print(arr[i]+" ");
      }
      
      System.out.println("]");

        
      













        
    }

   

   
    
}
