import java.util.Scanner;

public class _05_PRACTICE {

    public static boolean SORTED(int arr[],int i){
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
            
        }
           
        boolean isSorted= SORTED(arr, i+1);
        return isSorted;
       
        
        
    
    }

    public static int  FirstOcuurence(int arr[],int i,int key){
        if(arr[i]==key){
            return i;
        }

       return FirstOcuurence(arr, i+1, key);
    }

    public static int LastOcuurrence(int arr[],int i,int key,int index1){
        // int index=0;
        if (i==arr.length) {
            return index1;
            
        }
        if (arr[i]==key) {
            index1=i;
            }

       return LastOcuurrence(arr, i+1, key,index1);
    }

    public static int LastOcuurrence2(int arr[],int key,int i){
        if (i==arr.length ){
            return -1;
            
        }
        int isFound=LastOcuurrence2(arr,key,i+1);

        if (isFound==-1&&arr[i]==key) {
            return i;
            
        }
        return isFound;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int arr[]={2,3,4,5,6,7,8,7};
       int i=0;
        
        // boolean isSorted=SORTED(arr,i);

        // if (isSorted) {
        //     System.out.println("your given array is sorted");
            
        // }else{
        //     System.out.println("your given array is not sorted ");

        // }
        int key =sc.nextInt();
        int index1=0;

        // int Index=FirstOcuurence(arr,i,key);

        int index=LastOcuurrence(arr,i,key,index1);
        System.out.println(index);
    }
    
}
