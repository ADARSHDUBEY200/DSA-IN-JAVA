import java.util.Scanner;

public class _05_PRACTICE {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER THE NUMBER OF LINES OF HOLLOW RECTANGLE YOU WANT TO DRAW THROUGH THE STAR");
      int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i==1||i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");

                }
            }else{
            for(int j=1; j<=n;j++){

                if(j==1||j==n){
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
