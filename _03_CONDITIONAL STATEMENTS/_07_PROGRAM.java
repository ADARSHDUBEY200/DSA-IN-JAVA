import java.util.*;

public class _07_PROGRAM {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        
        // CHECKS IF NUMBER IS EVEN OR ODD
        String type= (number%2==0)?"even":"odd";
        System.out.println("YOUR GIVEN NU9MBER IS : "+type);

        // CHECKS IF STUDENT IS PASS OR FAIL
        String Rc= number>33?"PASS":"FAIL";
        System.out.println("YOUR REPORT CARD IS : " +Rc);
    }
    
}
