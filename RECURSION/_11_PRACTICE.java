public class _11_PRACTICE {

    public static void FindAllIndices(int arr [] , int index, int key ){

        // BASE CASE 
        if(index == arr.length){
            return ;
        }

        // KAAM 
        if(arr[index] == key ){
            System.out.print(index + " ");
            FindAllIndices(arr, index+1,2);
        }else{
            FindAllIndices(arr, index+1,2);
        }

        // BELIVE IN THE RECURSIVE FUNCTION

    }

    public static void main(String[] args) {
        int arr [] = {3,2,4,5,6,2,7,2,2};
        FindAllIndices(arr,0,2);
    }
    
}
