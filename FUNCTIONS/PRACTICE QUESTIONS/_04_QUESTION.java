import java.util.Scanner;

public class _04_QUESTION {

    public static int SumOfDigit(int n){
        int Value=0;
        while(n>0){
            int lastdigit=n%10;
            n=n/10;

            Value=Value+ lastdigit;
        }
        return Value;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO SUM THE DIGITS OF ");
        int n= sc.nextInt();

        int Value=SumOfDigit(n);

        System.out.println("THE SUM OF THE INTERGRS OF THE DIGITS OF THE GIVEN NUMBER IS : "+Value);

    }
    
}
