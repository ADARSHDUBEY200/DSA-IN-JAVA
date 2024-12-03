
public class _01_PRACTICE {

    public static void PrintArr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void MergeSort(String arr[],int si ,int ei){

        //base
        if (si>=ei) {
            return;
            
        }

        //kaam
        int mid = si+(ei-si)/2;
        MergeSort(arr, si, mid);// Left part of the array 
        MergeSort(arr, mid+1, ei);//Right part of the array
        merge(arr,si,mid,ei);
    }

    public static void merge(String arr[],int si ,int mid ,int ei){

        String temp[]=new String[ei-si+1];
        int i=si;//ITERATOR OF THE LEFT PART OF THE ARRAY
        int j=mid+1;// ITERATOR OF THE RIGHT OF THE ARRAY
        int k = 0 ;

        while (i<=mid&& j<=ei) {

            int result=arr[i].compareTo(arr[j]);

            if (result<0) {

                temp[k]=arr[i];
                i++;
                
            }else{
                temp[k]=arr[j];
                j++;
            }

            k++;
            
        }

        //left over part of the left part of the array 
        while (i<=mid) {

            temp[k]=arr[i];
            i++;
            
        }

        //left over part of the right array 

        while (j<=ei) {
            temp[k]=arr[i];
            j++;
            
        }

        //copy the temporay array to the original array 

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void main(String[] args) {
        
        String arr[]={ "sun", "earth", "mars", "mercury"};

        MergeSort(arr,0 , arr.length-1);
        PrintArr(arr);
    }
    
}
