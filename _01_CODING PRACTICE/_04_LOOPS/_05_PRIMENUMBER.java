import java.util.Scanner;

public class _05_PRIMENUMBER {

    public static void main(String[] args) {

        // WHEN RUNNING THE LOOP FOR THE N-2 TIMES
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT : ");
        int n = sc.nextInt();

        // if (n == 2) {
        //     System.out.println("THE NUMBER IS PRIME : ");
        // } else {
        //     boolean isPrime = true;

        //     for (int i = 2; i < n - 1; i++) {

        //         if (n % i == 0) {
        //             isPrime = false;
        //         }

        //     }

        //     if( isPrime == true){
        //         System.out.println("THE NUMBER IS PRIME NUMBER : ");
        //     }else{
        //         System.out.println("THE NUMBER IS NOT A PRIME NUMBER : ");
        //     }
        // }


        //  THE LOOP IS NOW RUNNING ROOT N TIMES WHICH BETTER THEN THE N-1 TIMES 

        if(n == 2){
            System.out.println("THE NUMBER IS PRIME: ");
        }else {
            boolean isPrime = true ;

            for(int i =2 ; i<=Math.sqrt(n); i++){

                if(n % i == 0){
                    isPrime = false;

                }
            }

            if(isPrime == true){
                System.out.println("THE NUMBER IS PRIME : ");
            }else{
                System.out.println("THE NUMBER IS NOT A PRIME NUMBER : ");
            }
        }




    }

}
