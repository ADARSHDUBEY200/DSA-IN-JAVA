import java.util.Scanner;

public class _04_FLOYDS_PYRAMID {

    public static void FLOYDS(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS FOR YOUR FLOYDS PYRAMID ");
        int n = sc.nextInt();

        FLOYDS(n);
    }
    
}
