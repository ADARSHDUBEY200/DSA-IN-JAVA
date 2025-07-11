import java.util.Scanner;

public class _03_LARGEST_NUMBER {

    public static int LargestNumber(int arr [] ){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i =0 ; i<arr.length; i++){

            if(largest < arr[i]){
                largest = arr[i];
            }

            if(smallest> arr[i]){
                smallest = arr[i];
            }

        }

        System.out.println("THE SMALLEST VAKUE IS THE : "+smallest);

        return largest;

    }

    public static void main(String[] args) {
        
        int arr []  = {10, 34, 27 ,65 , 2,  17 , 48 , 55 };

        int value =LargestNumber(arr);
        System.out.println("THE LARGEST NUMBER IS : "+value );
    }
    
}
