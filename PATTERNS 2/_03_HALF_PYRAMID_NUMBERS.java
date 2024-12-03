import java.util.Scanner;

public class _03_HALF_PYRAMID_NUMBERS {

    public static void Pyramid3(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void Pyramid4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS YOU WANT IN YOU HALF PYRAMID ");
        int n= sc.nextInt();

        Pyramid3(n);
        System.out.println("THIS IS PRINTED BY PYRAMID 4");
        Pyramid4(n);

    }
    
}
