import java.util.Scanner;

public class _04_PRACTICE {

    public static int factorial(int n){
        
        int fact =1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
         return fact;

    }

    public static int bioCoeff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);

        int bioCoeff= (n_fact)/(r_fact*nmr_fact);
        return bioCoeff;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUBER YOU WANT THE VARIABLE OF");
        int n = sc.nextInt();
        System.out.println("ENTER THE VALUE OF r YOU WANT FOR YOUR BINOMIAL COEFFICIENT ");
        int r = sc.nextInt();

        int bic=bioCoeff(n, r);

        System.out.println("THE VALUE OF YOUR BIONOMAIL COEFFICIENT IS : "+bic);



       
    }
    
}
