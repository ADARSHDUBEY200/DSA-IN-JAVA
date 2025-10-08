import java.util.Scanner;

public class _06_PROGRAM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        
      //THIS CODE IS WRITTEN WITHOUT THE HELP OF THE NESTED IF STATEMENTS
      System.out.println("THIS OUTPUT IS COMING WITH THE HELP OF WITHOUT USING THE NESTED IF STATEMNETS ");
       if((num1>=num2) && (num1>=num3)){

        System.out.println("THE LARGEST NUMBER IS 1 NUMBER : " +num1);
       }else if(num2>=num3){
        System.out.println("THE LARGEST NUMBER IS 2 NUMBER : " +num2);
       }else{
        System.out.println("THE LARGEST NUMBER IS 3 NUMBER : " +num3);
       }




       // THIS IS IS WITH THE HELP OF NESTED IF STATEMENTS;
       System.out.println("THIS OUPUT IS COMING WITH THE HELP OF NESTED IF STATEMENTS ");
        if(num1>=num2){
            if(num1>=num3){
                System.out.println("NUMBER 1 IS GREATER :  " +num1);
            }else{
                System.out.println("NUMBER 3 IS GREATER :  "+num3);
            }
        }else if(num2>=num3){
            System.out.println("NUMBER 2 IS GREATER :   "+num2);
        }else{
            System.out.println("NUMBER 3 IS GREATER :   "+num3);
        }
    }
    
}
