

public class _02_PRACTICE {

    public static int  Factorial(int n){

        if(n==0){
            return 1;
        }

        int fact = n*Factorial(n-1);

        return fact;
    }

    public static void main(String[] args) {

        int fact=Factorial(5);
        System.out.println(fact);
        
    }
    
}
