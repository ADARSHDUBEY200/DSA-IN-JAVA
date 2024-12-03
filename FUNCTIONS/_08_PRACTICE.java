import java.util.Scanner;

public class _08_PRACTICE {

    // public static int boolToDeci(int n){
    //     int Value=0;
        
    //     for(int i=0;n>0;i++){
            
    //         int lastdigit=n%10;
    //         n = n/10;
    //         Value=Value+ (int)Math.pow(2,i)*lastdigit;
            
    //     }
    //     return Value;
    // }

    public static int decToBoll(int n1){
        int Value1=0;
        int dec=1;
        while(n1/2==0){
            int rem = n1%2;
            n1=n1/2;
            Value1=Value1+rem*dec;
            dec=dec*10;

        }
        return Value1;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        // System.out.println("ENTER THE BINARY NUMBER THAT YOU WANT TO CONVERT IT IN A DECIMAL NUMBER");
        // int n = sc.nextInt();
        System.out.println("ENTER THE DECIMAL VALUE YOU WANT TO CONVERT IT TO BINARY NUMBER ");
        int n1=sc.nextInt();

        // int Value= boolToDeci(n);
        // System.out.println("THE CONVERETD VALUE OF YOUR GIVEN BINARY NUMBER TO  DECIMAL NUMBER IS : "+Value);
        int Value1= decToBoll(n1);
        System.out.println("THE CONVERTED VALUE OF YOUR GIVEN DECIMAL NUMBER TO THE BINARY NUMBER IS : "+Value1);
    }
    
}
