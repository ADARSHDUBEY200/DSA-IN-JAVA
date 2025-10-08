import java.util.Scanner;

public class _03_QUESTION {

    public static boolean Palindrome(int n){
        int Value=0;
        int num=n;
        while(n>0){
            int lastdigit=n%10;
            n=n/10;

            Value=(Value*10)+lastdigit;
           
        };
        
        if(num==Value){
           
            return true;
        }else{
            return false;
        }

       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int n=sc.nextInt();

        boolean Value1 = Palindrome(n);

        System.out.println("YOUR NUMBER IS PALINDROME THEN THE ANSWER IS TRUE OTHERWISE THE ANSWER IS FALSE : "+Value1);

    }
    
}
