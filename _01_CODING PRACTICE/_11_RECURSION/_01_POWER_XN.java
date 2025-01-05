
public class _01_POWER_XN {

    public static double  Power(double  a , double  n ){

        // BASE CASE

        if (n==0) {

            return 1;
            
        }

        // WORK 

        double  halfpower = Power(a, n/2);

        double halfpowersq = halfpower*halfpower;


        // n is odd 
        if(n%2!=0 ){

            halfpowersq= a * halfpowersq;
        }

        return halfpowersq;
    }

    public static void main(String[] args) {
        

        double  n = 2000;
        double  a =2 ;

        double  value = Power(a , n);

        System.out.println("THE VALUE OF YOUR SQUARE IS : "+value );
    }
    
}
