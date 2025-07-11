public class _06_SEARCH_SORTED_ROTATED_ARRAY {

    public static int Search(int arr [] , int target ){

        int si =0 ;
        int ei = arr.length-1 ;

      

        while( si <= ei ){

            int mid = si + (ei-si)/2;

            // COMAPRE WITH THE MID ;
            if(arr[mid] == target){
                return mid ;
            }

            // CASE 1 : IF MID IS LIE ON THE LINE 1 
            if(arr[si] <= arr[mid]){

                //case a : if target is samller than mid and greater than si
                if( target >= arr[si] && target <= arr[mid]){
                  
                    ei = mid-1;
                }else{
                     //case b : if the above constion is not true 
                    si = mid+1;
                   
                }

               
            }

            // CASE 2 : IF MID ID LIE ON THE LINE 2 

           else if(arr[mid] <= arr[ei]){
                
                // case c: if target is smaller ei and greater than the mid 
                if(target >= arr[mid] && target <= arr[ei]){
                     si = mid+1;
                     
                }else {
                    // case d : if the above condsition is not true 
                    
                     ei = mid-1 ;
                }
            }

        }

        return -1 ;
    }

    public static void main(String[] args) {
        
        int arr [] = {4,5,6,7,0,1,2};
        int target = 7 ;

        int index = Search(arr, target );
        System.out.println("THE INDEX AT WHICH OUR TARGET IS FOUND AT IS : "+ index );
    }
    
}
