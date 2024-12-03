public class _07_X_TO_POWER_N {

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int value=x*power(x, n-1);
        return value;
    }

    public static void main(String[] args) {
        int x=2;
        int n=10;
        
        int power=power(x,n);
        System.out.println(power);
    }
    
}
