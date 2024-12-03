import java.util.Scanner;

public class _03_PRACTICE {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int range=sc.nextInt();
        int counter=1;
        int sum=0;
        
        while(counter<=range){
             sum+=counter;
             counter++;
        }
        System.err.println("sum : " +sum);
    }
    
}
