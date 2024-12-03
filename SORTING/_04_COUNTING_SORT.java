

public class _04_COUNTING_SORT {


    public static void COUNTING_SORT(int arr[],int RANGE){
        // MAKING OF COUNT ARRAY
        System.out.println("COUNT ARRAY FOR THE GIVEN ARRAY IS : ");
        int count[]= new int[RANGE+1];
        for(int i=0;i<=arr.length-1;i++){

            ++count[arr[i]];

        };

        // PRINTING OF THE COUNT ARRAY

        System.out.print("[");

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(count[i]+" ");
        }

        System.out.println("]");
        

        //MAIN ALGORITHM OF THE COUNTING SORT 

        int index=0;
        for(int i=0;i<=count.length-1;i++){
                while(count[i]>0){
                    arr[index]=i;
                    index++;
                    count[i]--;

                }

            }
        }


        
    


    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};

        //FINDING THE RANGE OF THE ARRAY

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<=arr.length-1;i++){
            if(max<arr[i]){
                max=arr[i];
            };
        };

        //RANGE
        int RANGE=max;
        System.out.println(RANGE);

        COUNTING_SORT(arr,RANGE);


        //PRINTING OF THE ARRAY

        System.out.print("[");

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("]");
    }
    
}
