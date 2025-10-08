import java.util.Scanner;

public class _05_01TRIANGLE {

    public static void _01TRIANGLE(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS YOU WANT IN YOUR ");
        int n= sc.nextInt();


        _01TRIANGLE(n);

    }
    
}
