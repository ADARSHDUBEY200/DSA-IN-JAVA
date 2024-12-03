import java.util.Scanner;

public class _02_PRACTICE {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NO.OF LINES OF STARS IN INVERTED FORM YOU WANT TO PRINT");
        int n= sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("ANOTHER METHOD FOR PRINTING INVERTED STARS");

        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
