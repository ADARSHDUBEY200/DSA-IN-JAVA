public class _11_PRACTICE {

    public static boolean ISSORTED(int arr [],int n){
         boolean isSorted = true ;

         if (n==arr.length-1) {

            return true ;

            
         }

        if (arr[n]>arr[n+1]) {
            isSorted =false;
            return isSorted;
            
        }

       return ISSORTED(arr, n+1);

    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,7,8};

        

        boolean value =ISSORTED(arr,0);
        System.out.println("the is sorted or not : "+value);
        
    }
    
}
