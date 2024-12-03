public class _08_PRACTICE {

    public static void  DecreasingOrder(int n){

        if (n==1) {
            System.out.print(n);
            return ;
            
        }
        System.out.print(n);


        DecreasingOrder(n-1);


    }

    public static void main(String[] args) {
        int n=5;

        DecreasingOrder(n);
        

    }
    
}
