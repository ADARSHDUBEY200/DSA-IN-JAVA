import java.util.Scanner;

public class _03_PRACYICE {

    public static int multiply(int a, int b){

        int multi= a*b;
        return  multi;

    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("ENTER THE VALUE OF THE a : ");
        int a=sc.nextInt();
        System.out.println("ENTER THE VALUE OF THE b ");
        int b=sc.nextInt();

        int multi=multiply(a, b);
        System.out.println("THE MULTIPLICATION OF YOUR GIVEN NUMBER IS : "+multi);
        

    }
    
}
