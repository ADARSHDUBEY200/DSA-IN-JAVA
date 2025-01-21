
public class _01_MERGE_SORT {

    public static void MergeSort(int arr [], int low , int high){

        //BASE CASE 

        if (low >= high) {
            
            return ;

        }

        int mid = (low+high)/2;

        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr , low , high , mid );

        
    }

    public static void Merge(int arr , int low , int high , int mid){


    }

    public static void main(String[] args) {
        

        int arr [] = {2,1,3,5,4,8,7};
        int low = 0 ; 
        int high = arr.length-1;
        

        MergeSort(arr, low , high);
    }
    
}
