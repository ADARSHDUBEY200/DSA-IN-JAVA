import java.util.Scanner;

public class _08_PRACTICE {
    public static void main(String[] args) {
        
      Scanner sc= new Scanner(System.in);

      do {
        System.out.println("ENTER YOUR NUMBER");
        int n=sc.nextInt();
        if( n%10==0){
            break;
        }
        System.out.println("your number is"+n);
      } while (true);
    }
    
}
