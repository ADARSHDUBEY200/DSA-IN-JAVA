public class _06_INDEX_FIND {

    public static int Index(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
            
        }

        if(arr[i]==key){
            return i;
        }

       return Index(arr, key, i+1);

    }

    public static int LastOcuurence(int arr[],int key,int n){

        if (arr[n]==key) {
            return n;
        }

         return LastOcuurence(arr, key, n-1);

    }

    public static int LastOcuurence2(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }

        int isfound =LastOcuurence2(arr,key,i+1);

        if(isfound==-1 && arr[i]==key){
            return i;
        }

        return isfound ;

        
    }

    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,7};
        int key=5;
        int i=0;
        int n=arr.length-1;

        int Index=Index(arr,key,i);
        int Last=LastOcuurence(arr, key, n);
        int Last2=LastOcuurence2(arr, key, i);

        System.out.println(Index);
        System.out.println(Last);
        System.out.println(Last2);
    }
    
}
