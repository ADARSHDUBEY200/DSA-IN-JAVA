import java.util.Scanner;

public class _10_DIAMOND {

    public static void DIAMOND(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            //stars
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //2nd half

        for(int i=n;i>=1;i--){
             //spaces
             for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            //stars
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE VALUE YOU WANT IN YOUR ROWS");
        int n= sc.nextInt();

        DIAMOND(n);

    }
}
