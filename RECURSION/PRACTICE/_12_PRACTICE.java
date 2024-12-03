public class _12_PRACTICE {

    public static int firstOcuurence(int arr[],int i,int key){
        if (i==arr.length-1) {
            return -1;
            
        }

        if (arr[i]==key) {
            return i;
            
        }

        return firstOcuurence(arr, i+1, key);
    }

    public static int lastOcurrence(int arr[],int i ,int key){

        if (i==arr.length) {

            return -1;
            
        }


       int value = lastOcurrence(arr, i+1, key);
       
        if (value==-1&&arr[i]==key) {
            return i;
            
        }

        return value ;
    }

    public static void main(String[] args) {

        int arr[]={1,2,6,6,5,7};
        
        int value =firstOcuurence(arr,0,5);
        int value2 =lastOcurrence (arr,0,6);
        System.out.println("THE VALUE AT YOUR KEY IS : "+value);
        System.out.println("THE LAST OCCURENCE OF THE ELEMENT IS : "+value2);
    }
    
}
