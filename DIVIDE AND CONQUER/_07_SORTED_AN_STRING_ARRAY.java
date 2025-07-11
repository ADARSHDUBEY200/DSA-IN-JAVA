public class _07_SORTED_AN_STRING_ARRAY {

    public static void MergeSortString(String arr [] , int si , int ei){
        // BASE CASE 
        if(si >= ei){
            return;
        }

        //WORK 
        int mid = si + (ei -si)/2 ;

        // SORT THE LEFT PART OF THE ARRAY 
        MergeSortString(arr, si, mid);

        //SORT THE RIGHT PART OF THE ARRAY 
        MergeSortString(arr, mid + 1 , ei);

        // MERGE THE LEFT PART AND THE RIGHT PART OF THE ARRAY 
        Merge(arr , si , mid , ei);

        // BELIVE IN THE INNER FUNCTION CALL 
    }

    public static void Merge(String arr [] , int si , int mid , int ei ){
        String temp [] = new String[ei - si + 1];
        int i = si ;
        int j = mid+1;
        int k = 0;


        while(j <= ei && i <= mid){
            String str1 = arr[i];
            String str2 = arr[j];

            if(str1.compareTo(str2) <= 0){
                temp[k] = str1 ;
                i++;
            }else if(str1.compareTo(str2) > 0){
                temp[k] = str2 ;
                j++;
            }

            k++;

        }

        // Remaining left part of the array 
        while(i<= mid ){
            temp[k] = arr[i];
            i++;
            k++;
        }

        //Remaining right part of the array 
        while( j <= ei ){
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy That array inside the original array 
        for(k=0, i=si ; k < temp.length; k++,i++){

            arr[i] = temp[k];


        }
    }

    public static void PrintArr(String arr []){
        for( int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        String arr [] = { "sun", "earth", "mars", "mercury"};
        PrintArr(arr);
        MergeSortString(arr, 0, arr.length-1);
        System.out.println();
        PrintArr(arr);
    }
    
}
