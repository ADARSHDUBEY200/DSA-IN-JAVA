import java.util.Scanner;

public class _09_PRACTICE {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        do {
            System.out.println("ENTER YOUR NUMBER " );
            
            int n =sc.nextInt();
            if(n%10==0){
              continue;
            }
            System.out.println("YOUR NUMBER IS " +n);
        } while (true);
    }
    
}
