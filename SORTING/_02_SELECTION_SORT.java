

public class _02_SELECTION_SORT {

    public static void SELECTION_SORT(int arr[]){

        
        

        for(int i=0;i<=arr.length-1;i++){
            int index=  i; // FOR THE MINIMUM POSITION OF THE WELEMENT IN THE ARRAY
            
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[index]>arr[j]){
                    index=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

    }

    public static void main(String[] args) {
        
        int arr[]={5,4,1,3,2};

        SELECTION_SORT(arr);

        System.out.println("THE SORTED ARRAY IS  BY SELECTION SORT IS :");

        System.out.print("[");

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("]");
    }
    
}
