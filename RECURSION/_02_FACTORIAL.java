

public class _02_FACTORIAL {

    public static int Fact(int n){

        if (n==0) {
            return 1;
            
        }

        int fact=n*Fact(n-1);//THIS GIVES US THE FACTORIAL 
        return fact;
    }

    public static void main(String[] args) {

        int value =Fact(5);
        System.out.println(value);
        
    }
    
}
