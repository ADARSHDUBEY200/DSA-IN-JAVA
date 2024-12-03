import java.util.Scanner;

public class _03_PRACTICE {

    public static int   SUM(int n){

        if(n==1){
            return 1;
        }
        int asum=SUM(n-1);

        int TotalSum=n+asum;
        return TotalSum;

    }
    public static void main(String[] args) {
        
        //SUM OF FIRST N NATURAL NUMBERS 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int total = SUM(5);
       System.out.println(total);
        
    }
    
}
