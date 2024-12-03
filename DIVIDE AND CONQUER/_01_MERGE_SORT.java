
public class _01_MERGE_SORT {

    public static void PrintArr(int arr[]){

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
        //base case 
        if (si>=ei) {
            return;
            
        }

        //kaam 
        int mid =si+(ei-si)/2;
        mergeSort(arr, si, mid);//left
        mergeSort(arr, mid+1, ei);//right
        merge(arr, si,mid,ei);//For merging the sorted left and right array 
    }

    public static void merge(int arr[],int si,int mid,int ei){

        int temp[]=new int[ei-si+1];

        int i=si;//ITERATOR FOR THE LEFT PART
        int j=mid+1;// ITERATOR FOR THE RIGHT PART
        int k=0;// ITERATOR FOR THE TEMPORARY ARRAY

        while(i<=mid&& j<=ei){

            if (arr[i]<arr[j]) {

                temp[k]=arr[i];
                i++;
                
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //left part lefted elements 

        while (i<=mid) {

            temp[k]=arr[i];
            i++;
            
        }

        //right part of the lefted elements 
        while (j<=ei) {

            temp[k]=arr[j];
            j++;
            
        }


        //COPY THE SORTED ELEMENTS OF THE TEMPORARY ARRAY TO THE ORIGINAL ARRAY 

        for(k=0,i=si;k<=temp.length-1;k++,i++){

            arr[i]=temp[k];


        }
        

    }

    public static void main(String[] args) {
        int arr []={6,3,9,5,2,8};

        mergeSort(arr,0,arr.length-1);
        PrintArr(arr);
    }
    
}
