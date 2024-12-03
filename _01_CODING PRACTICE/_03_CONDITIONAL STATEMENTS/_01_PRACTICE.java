import java.util.Scanner;
public class _01_PRACTICE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        // FIND THE LARGEST OF THE TWO NUMBERS
        
        if (num1>num2) {
            System.out.println("THE NUM1 IS THE LARGEST NUMBER");
            
        }else{
            System.out.println("THE LARGEST NUMBER IS NUM2");
        }

    }
    
}
