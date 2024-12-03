

public class _03_INSERTION_SORT {

    public static void INSERTION_SORT(int arr[]){
        for (int i=1; i<=arr.length-1;i++ ){
            int curr=arr[i];
            int prev=i-1;

        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }

        //INSERTION THE ELEMENT 
        arr[prev+1]=curr;

        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};

        INSERTION_SORT(arr);
        
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
