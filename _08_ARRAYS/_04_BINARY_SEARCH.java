import java.util.Scanner;

public class _04_BINARY_SEARCH {
    public static int BINARYSEARCH(int arr[],int key){

        int start=0; int end = arr.length-1;

        while(start<=end){
            int mid= (start+end)/2;

            if(arr[mid]==key){
                return mid;

            }
            if(arr[mid]<key){
                start=mid+1;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key= sc.nextInt();
        
        int arr[]={2,4,6,8,10,12,14,16,18,20};

        int index= BINARYSEARCH(arr,key);
       if (index==-1) {
        System.out.println("YOUR GIVEN IS NOT FOUND INSIDE THE ARRAY");
        
       } else {
        System.out.println("THE GIVEN VALUE IS FOUND AT THE INDEX : "+index);
        
       }
    }
    
    
}
