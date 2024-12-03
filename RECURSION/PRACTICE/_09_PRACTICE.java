
public class _09_PRACTICE {

    public static int  fact(int n ){

        if (n==1) {
            return 1;
            
        }

        int fnm1=fact(n-1);

        int factorial = n*fnm1;
        return factorial;
    }

    public static void main(String[] args) {
        int n =5;
        
        int value =fact(n);
        System.out.println(value );
    }
    
}
