public class _03_PRACTICE {

    public static void MergeSort(int arr[], int si , int ei ){
        // BASE CASE 
        if(si >= ei){
            return;
        }

        // WORK 
        int mid = si + (ei-si)/2 ;

        //SORT THE LEFT SORT 
        MergeSort(arr, si, mid);

        //SORT THE RIGHT PART 
        MergeSort(arr, mid+1, ei);

        // MERGE THE LEFT SORTED PART AND THE RIGHT SORTED PART OF THE ARRAY 
        Merge(arr, si, mid, ei);

        //BELEIVE IN THE INNER FUNCTION CALL 

    }

    public static void Merge(int arr [], int si,int mid , int ei ){
        int temp [] = new int[ei-si+1];
        int i = si ;
        int j = mid+1;
        int k =0;

        while(i<= mid && j<=ei){

            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else if( arr[j] < arr[i]){
                temp[k] = arr[j];
                 j++;
            }

            k++;
        }

        // remaining of the left part 
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        //remaining of the right part 
        while(j <= ei){
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy the temp array to original array 
        for(  k=0 , i =si ; k< temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr []){
        for( int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        int arr [] = {6,3,9,5,2,8};
        MergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
