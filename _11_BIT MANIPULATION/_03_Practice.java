import java.util.Scanner;

public class _03_Practice {

    public static void ODDEVEN(int num ){

        System.out.println(num&1);
        if ((num & 1)==1) {

            System.out.println("YOUR NUMBER IS ODD");
            
        }else{
            System.out.println("YOUR NUMBER IS EVEN");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO ENTER ");
        int num= sc.nextInt();

        ODDEVEN(num);

    }
    
}
