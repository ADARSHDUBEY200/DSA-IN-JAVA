import java.util.Scanner;

public class _02_PRACTICE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DIGITS YOU WANT ");
        int n=sc.nextInt();
        int sum1=0;
        int sum2=0;
       
        while (n>0){ 
            int lastdigit=n%10;
            if(lastdigit%2==0){
               
                sum1=sum1+lastdigit;
            }else{
                
                sum2=sum2+lastdigit;
            }
            n=n/10;

        }

        System.out.println("THE SUM OF EVEN NUMBERS IN YOUR GIVEN DIGITS IS :" +sum1);
        System.out.println("THE SUM OF ODD NUMBERS IN YOUR GIVEN DIGITS IS :" +sum2);
        
    }
    
}
