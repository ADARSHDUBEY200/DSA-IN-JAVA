
public class _02_QUICK_SORT {
    
    public static void PrintArr(int arr[]){

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr [],int si,int ei){

        if (si>=ei) {
            return;
            
        }


        //kaam 
        int pIdx=partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);//left part
        quickSort(arr, pIdx+1, ei);//Right part 
        
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];

        int i=si-1;//ITERATOR FOR MAKING LEFT PART OF THE ARRARY
        int j =si;//Iterator of the array

        while (j<=ei) {

            if (arr[j]<pivot) {
                i++;
             

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
             
                
            }
            j++;
            
        }

        //relocate the pivot at correct position 

        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[ei]=temp;

        return i;



    }

    public static void main(String[] args) {

        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        PrintArr(arr);
        
    }
    
}
