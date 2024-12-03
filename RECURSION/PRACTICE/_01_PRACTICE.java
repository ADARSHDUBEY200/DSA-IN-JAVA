import java.util.Scanner;

public class _01_PRACTICE {

    public static void DecresingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.print(n+" ");
        DecresingOrder(n-1);
    }

    public static void DecresingOrder2(int n1,int N){

        if (n1==N) {
            System.out.print(n1+" ");
            return;
            
        }

        DecresingOrder2(n1+1,N);

        System.out.print(n1+" ");



    }

    public static void IncreasingOrder1(int n, int N ){
        if (n==N) {
            System.out.println(n);
            return;
            
        }

        System.out.print(n+" ");
        IncreasingOrder1(n+1, N);
    }

    public static void IncreasingOrder2(int n ){
       if (n==1){
        System.out.println(n+" ");
        return;
       }

        IncreasingOrder2(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE UPTIL YOU WANT TO PRINT THE NUMBER ");
        int N = sc.nextInt();
       
        int n1=1;

        DecresingOrder(10);
        DecresingOrder2(n1, N );

        // IncreasingOrder1(n1,N);
        // System.out.println("ENTER THE VALUE UPTIL YOU WANT TO PRINT THE NUMBER  ");
        // int n = sc.nextInt();
        // IncreasingOrder2(n);
        
    }
    
}
