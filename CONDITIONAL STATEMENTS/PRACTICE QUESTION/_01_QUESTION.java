import java.util.*;

public class _01_QUESTION {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO ENTER");
        int num1 = sc.nextInt();

        if(num1<0){
            System.out.println("YOUR GIVEN NUMBER IS NEGATIVE");
        }else{
            System.out.println("YOUR GIVEN NUMBER IS POSITIVE");
        }
    }
    
}
