import java.util.Scanner;

public class _07_PRACTICE {

    public static int  Palindrome(String str ){
        int first =0;
        int last = str.length()-1;
        while (first<=last){
            if(str.charAt(first)!=str.charAt(last)){

                return -1;
            }
            first++;
            last--;
        }

        return 1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to enter ");
        String str = sc.next();

        int value =Palindrome(str);

        if (value==-1) {

            System.out.println("YOUR GIVEN STRING IS NOT PALINDROME ");
            
        }else{
            System.out.println("YOUR GIVEN STRING IS PALINDROME ");
        }

    }
    
}
