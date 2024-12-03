

public class _01_BUBBLE_SORT {

    public static void Bubble_sort(int arr[]){
        int n= arr.length-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

      
    }

    public static void main(String[] args) {
        int arr[]= {5,4,1,3,2};

        Bubble_sort( arr);


        System.out.println("THE SORTED ARRAY IS : ");
        System.out.print("[");
        for(int i=0;i<=arr.length-1;i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println("]");
    }
    
}
