import java.util.*;

public class _01_QUESTIONS {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int n1=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int n2=sc.nextInt();
        System.out.println("ENTER THE THIRD NUMBER");
        int n3=sc.nextInt();

        int average =(n1+n2+n3)/3;
        System.out.println("THE AVERAGE OF YOUR THREE NUMBERS IS : ");
        System.out.println(average);
    }
    
}
