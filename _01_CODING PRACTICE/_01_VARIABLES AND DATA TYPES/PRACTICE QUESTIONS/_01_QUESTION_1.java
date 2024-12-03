
import java.util.Scanner;

public class _01_QUESTION_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        int num1=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int num2=sc.nextInt();
        System.out.println("ENTER THE THIRD NUMBER : ");
        int num3=sc.nextInt();

        int average= (num1+num2+num3)/3;
        System.out.println("THE AVERAGE OF THE THREE NUMBERS IS : "+average);

    }
    
}
