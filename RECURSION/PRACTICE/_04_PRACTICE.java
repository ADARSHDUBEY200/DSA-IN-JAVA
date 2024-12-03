

public class _04_PRACTICE {

    public static int Fibnacci(int n ){

        if(n==0|| n==1){
            return n;
        }

        int fib=Fibnacci(n-1)+Fibnacci(n-2);
        return fib;
    }
    public static void main(String[] args) {
        
        int fibo=Fibnacci(25);
        System.out.println(fibo);
    }
    
}
