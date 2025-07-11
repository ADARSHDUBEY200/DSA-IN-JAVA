import java.util.Scanner;

public class _01_LINEAR_SEARCH {

    public static int  LinearSearch(int arr [], int key ){

        for( int i =0 ; i< arr.length; i++){
            if(arr[i]== key){
                return i;
            }
        }

        return -1 ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        
        int arr [] = {1,20,10,16,17,15};


        int index = LinearSearch(arr,key);

        if(index == -1 ){
            System.out.println("THE KEY IS NOT FOUND AT THE INDEX : ");
        }else{
            System.out.println("THE KEY IS FOUND AT THE INDEX  : "+index );
        }
        
    }
    
}
