import java.util.Scanner;

public class _09_HOLLOW_ROHMBUS {

    public static void hollowRohmbus(int n){
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print("  ");
                }

                //stars 
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
            }else{
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print("  ");
                }

                //stars
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS YOU WANT IN YOUR HOLLOW ROHMBUS ");
        int n=sc.nextInt();

        hollowRohmbus(n);
    }
    
}
