import java.util.Scanner;

public class _01_HOWLLOW_REACTANGLE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS YOU WANT TO PRINT IN YOUR HOLLW RECTANGLE ");
        int n = sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLOUMNS YOU WANT IN YOUR HOLLOW RECTANGLE ");
        int n1=sc.nextInt();

        
        for(int i=1;i<=n;i++){
            if(i==1||i==n){
                for(int j=1; j<=n1;j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=1;j<=n1;j++){
                    if(j==1||j==n1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
    
}
