import java.util.*;

public class _09_CALCULATOR {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF A:  ");
        int a= sc.nextInt();
        System.out.println("ENTER THE VALUE OF B");
        int b= sc.nextInt();
        System.out.println("ENTER THE OPERATOR YOU WNAT TO PERFORM WITH YOUR OPERANDS ");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println("SUM OF YOUR NUMBER IS  "+(a+b));
                       break;
            case '-': System.out.println("SUM OF YOUR NUMBER IS  "+(a-b));
            break;
            case '*': System.out.println("SUM OF YOUR NUMBER IS  "+(a*b));
            break;
            case '/': System.out.println("SUM OF YOUR NUMBER IS  "+(a/b));
                     break;
            case '%': System.out.println("SUM OF YOUR NUMBER IS  "+(a%b));
                       break;           
        }           
    }
    
}
