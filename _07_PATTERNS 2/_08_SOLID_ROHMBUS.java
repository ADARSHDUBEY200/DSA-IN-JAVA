import java.util.Scanner;

public class _08_SOLID_ROHMBUS {
    public static void SolidRohmbus(int n){
            
        for(int i=1;i<=n;i++){
            for(int j=1;j<=((2*n)-i);j++){
                if(j<=n-i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OPF ROWS YOU WANT ");
        int n= sc.nextInt();

        SolidRohmbus(n);

    }
    
}
