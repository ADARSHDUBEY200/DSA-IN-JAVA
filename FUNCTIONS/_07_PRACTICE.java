import java.util.Scanner;

public class _07_PRACTICE {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
            return false;
           }
        }
        return true;
    }

    public static int primes(int n){
        int count =0;
        for(int i=2;i<=n;i++){

        if(isPrime(i)){
            System.out.print(i+" ");
            count++;

        }

    }
       System.out.println();
    
        return count;



    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER RANGE IN WHICH YOU WANT TO PRINT THE PRIME NUMBERS ");
        int n =sc.nextInt();
        int prime=primes(n);
        System.out.println("THE NUMBER OF THE PRIME NUMBER IS "+prime);

    }
    
}
