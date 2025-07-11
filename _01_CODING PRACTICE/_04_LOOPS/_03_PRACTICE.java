import java.util.Scanner;

public class _03_PRACTICE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int number = sc.nextInt();

        while(number > 0){
            int lastdigit = number % 10 ; // THIS IS NUMBER FOR FINDING THE LASTDIGIT NUMBER 
            System.out.print(lastdigit);
            number = number / 10 ; // FOR REMOVING THE LAST DIGIT IN THE NUMBER 

        }
        System.out.println("THE NUMBER YOUN ENTERED IS : "+number);
    }
    
}
