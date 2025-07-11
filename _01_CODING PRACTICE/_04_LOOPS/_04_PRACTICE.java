import java.util.Scanner;

public class _04_PRACTICE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("THE REVERSED NUMBER IS : ");
        int number = sc.nextInt();

        int rev = 0;
        while(number > 0){
            int lastdigit = number % 10 ;

            rev = (rev * 10) + lastdigit;

            number = number / 10 ;
        };


        System.out.println("THE REVESED NUMBER IS : "+rev);
        
    }
    
}
