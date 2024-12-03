
public class _02_PRACTICE {

    public static int LinearSearch(int numbers[],int key){

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {

        int numbers []={2,4,6,8,10,12};

       int index= LinearSearch(numbers, 10);

       if (index==-1) {
        System.out.println("KEY NOT FOUND ");
        
       }else{
        System.out.println("KEY IS FOUND AT THE INDEX : "+index);
       }

        
    }
    
}
