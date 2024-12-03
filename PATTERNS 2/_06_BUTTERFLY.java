import java.util.Scanner;

public class _06_BUTTERFLY {

    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){
            if(i<=n/2){
                for(int j=1;j<=n;j++){
                     if(j>i && j<=n-i){
                        System.out.print("  ");
                     }else{
                        System.out.print("* ");
                     }
                }
            }else{
                for(int j=n;j>=1;j--){
                    if(j<=n-i+1 || j>=i){
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
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS YOU WANT IN YOUR BUTTERFFLY");
        int n= sc.nextInt();

        Butterfly(n);
    }    
}
