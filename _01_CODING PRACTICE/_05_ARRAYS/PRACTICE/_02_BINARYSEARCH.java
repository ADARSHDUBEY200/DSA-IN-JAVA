import java.util.Scanner;

public class _02_BINARYSEARCH {

    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1 ;

    }

    public static void main(String[] args) {

        int arr[] = { 10, 12, 15, 17, 20, 40};
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE KEY YOU WANT TO FIND INSIDE THE ARRAY : ");
        int key = sc.nextInt();

        int index1 = BinarySearch(arr, key);

        if(index1 == -1 ){
            System.out.println("THE KEY IS NOT FOUND INSIDE THE ARRAY : ");
        }else{
            System.out.println("THE KEY IS FOUND AT THE INDEX : "+index1 );
        }
    }

}
