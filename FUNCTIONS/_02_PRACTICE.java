public class _02_PRACTICE {

   public static void swap (int a, int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println("THIS IS THE VALUE OF THE A AND B IN THE SWAP FUNCTION");
    System.out.println("THE VALUE OF THE a is : "+a);
    System.out.println("THE VALUE OF THE b is : "+b);

   } 
    


       public static void main(String[] args) {
        int a=5;
        int b=10;
        
        
        swap(a, b);
        System.out.println("THIS IS THE VALUE OF THE A AND B IN THE MAIN FUNCTION");
        System.out.println("THE VALUE OF THE a is : "+a);
        System.out.println("THE VALUE OF THE b is : "+b);

    }
    
}
