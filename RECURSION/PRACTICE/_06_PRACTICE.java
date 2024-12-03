public class _06_PRACTICE {

    public static int Power(int x,int n){

        if (n==0) {
            return 1;
            
        }

        int xnm1=Power(x, n-1);

        int pow=x*xnm1;

        return pow;
    }

    public static void main(String[] args) {

        int x=2;
        int n=5;
        
        int pow=Power(x,n);
        System.out.println(pow);
    }
    
}
