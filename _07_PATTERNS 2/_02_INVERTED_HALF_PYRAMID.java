import java.util.Scanner;

public class _02_INVERTED_HALF_PYRAMID {

    public static void Pyramid(int n,int n1){

        for(int i=1;i<=n;i++){
            for(int j=n1;j>=1;j--){
                if(j<=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void Pyramid2(int n){
        for(int i=1; i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }


            System.out.println();
        }
        }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERQ OF ROWS YOY WANT IN YOUR INVERTED PYRAMID");
        int n =sc.nextInt();
        // System.out.println("ENTER THE COLOUMNS YOU WANT IN YOUR HALF PYRAMID");
        // int n1= sc.nextInt();

        // Pyramid(n,n1);
        Pyramid2(n);

        

    }
    
}
