public class _13_PRACTICE_QUESTION_1 {

    public static void FindingKeys(int arr[],int index, int key ){

        //BASE 
        if (index==arr.length) {
            return ;
            
        }
        
        
        //kaam

        if (arr[index]==key) {
            System.out.print(index+" ");
            
        }
        FindingKeys(arr, index+1, key);
    }

    public static void main(String[] args) {
        
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};

        FindingKeys(arr,0,2);
    }
    
}
