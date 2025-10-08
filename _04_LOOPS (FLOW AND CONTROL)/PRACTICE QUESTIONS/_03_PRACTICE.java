import java.util.Scanner;
import java.util.*;

public class _03_PRACTICE {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT THE FACTORIAL OF : ");
        int n= sc.nextInt();
        int fact=1;
        
        for(int i=1;i<=n;i++){
           
            fact = fact*i;


        }

        System.out.println("THE FACTORIAL OF YOUR GIVEN NUMBER "+n+" IS : "+fact );
    }
    
}
