import java.util.*;

public class _01_PRACTICE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE INTEGER YOU WANT TO ENTER ");
        int integr=sc.nextInt();
        int even=0;
        int odd=0;

        while(integr>0){

            int lastdigit=integr%10;

            if (lastdigit%2==0) {
                even+=lastdigit;
                
            }else{
                odd+=lastdigit;
            }

            integr=integr/10;

        }

        System.out.println("SUM OF THE EVEN VALUES OF YOUR INTEGER IS : "+even);
        System.out.println("SUM OF THE ODD VALUES OF YOUR INTEGER IS : "+odd);
        
    }
    
}
