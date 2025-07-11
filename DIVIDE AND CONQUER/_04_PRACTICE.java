public class _04_PRACTICE {

    public static void QuickSort(int arr[], int si, int ei) {
        // BASE CASE
        if(si >= ei ){
            return ;
        }

        // WORK
        int pidx = partition(arr, si, ei);

        // SORT THE LEFT PART
        QuickSort(arr, si, pidx-1);

        // SORT THE RIGHT PART
        QuickSort(arr, pidx + 1, ei);

        // BELIVE IN THE INNER FUNCTION CALL

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        int j = si;

        while (j < ei) {

            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            j++;
        }

        i++;

        int temp = arr[i];
        arr[i] = pivot ;
        arr[ei] = temp;

        return i ;

    }

    public static void PrintArr(int arr[]){
        for( int i =0 ; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 6, 3, 9, 8, 2, 5 };
        QuickSort(arr, 0, arr.length - 1);
        PrintArr(arr);
    }

}
