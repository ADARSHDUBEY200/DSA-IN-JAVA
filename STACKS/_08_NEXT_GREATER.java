import java.util.Stack;

public class _08_NEXT_GREATER {

    // THE OPTIMIZED FORM FOR THIS QUESTION IS DONE BY USING THE STACK O(N)
    public static void NextGreater(int arr [] , int next[]){
        System.out.println("called");

        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1 ; i>=0 ; i--){

            // HERE WE CHECK THE CONSITION 
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                next[i] = -1 ; 
            }else{
                next[i]= arr[s.peek()];
            }

            s.push(i);
        }
    };

    

    // THIS IS THE BRUTE FORCE APPROACH FOR FINDING THE NEXT GREATER ELEMENT 
    // TIME COMPLEXITY O(N^2) // IT IS BAD TIME COMPLEXITY  
    public static void BruteNextGreater(int arr [] , int next []){
        for(int i=0 ; i< arr.length ; i++){
            
            // THSI CONDITION IS FOR THE LAST ELEMENT 
            if(i == arr.length-1 ){
                next[i] = -1 ;
            }
            for(int j =i+1 ; j< arr.length; j++){

                // IF THE NEXT GREATER ELEMENT IS FOUND OUT IN THE ARRAY 
                if(arr[i]< arr[j]){
                    next[i] = arr[j];
                    break;
                }
                
                // IF THE NEXT GREATER ELEMENT IS NOT FOUND FOR THE GIVEN ELEMENT 
                if(j == arr.length-1 && arr[i] > arr[j]){
                      next[i] = -1 ;
                }

            }
        }
    }

    public static void main(String[] args) {
        
        int arr [] = {6,8,0,1,3};
        int next_greater [] = new int[arr.length];

        // BruteNextGreater(arr, next_greater);
        NextGreater(arr, next_greater);

        System.out.println("THE NEXT GREATER ELEMENT OF THE ARRAY IS : ");

        for(int i=0 ; i < next_greater.length; i++ ){
            System.out.print(next_greater[i]+" ");
        }
    }
    
}
