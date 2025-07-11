public class _04_HEAP_SORT {

    public static void heapify(int arr[] , int i, int size){

        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxIdx = i ;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i ){

            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void HeapSort(int arr[]){

        // STEP :  1 : build a max heap 
        int n = arr.length-1;

        for(int i=n/2; i >= 0 ; i--){
            heapify(arr,i,n);
        }

        // TAKE THE LAST ELEMENT AND SWAP BOTH OF THEM 
        
        for(int i=n; i> 0 ; i--){
            // sawp 

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr , 0 , i);
        }
    }

    public static void main(String[] args) {
        
        int arr [] = {1,2,4,5,3};
        HeapSort(arr);

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
