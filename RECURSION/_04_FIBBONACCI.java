public class _04_FIBBONACCI {

    public static int Fib(int n){
        if (n==0||n==1) {
            return n;
            
        }

        int fnm1=Fib(n-1);
        int fnm2=Fib(n-2);
        int fib=fnm1+fnm2;
        return fib;

    }
    public static void main(String[] args) {
        
       int sum= Fib(50);
       System.out.println(sum);
    }
    
}
