
public class FIBONACCI {

    public static int Fibonacci(int n ){

        if (n==1) {
            return 1;

        }

        if ( n==0){

            return 0;
        }

        int fib = Fibonacci(n-1) + Fibonacci(n-2);

        return fib ;
    }

    public static void main(String[] args) {
        
        int n =9;

        int number = Fibonacci(n);

        System.out.println("THE FIBONAACCI NUMBER IS : "+number);
    }
    
}
