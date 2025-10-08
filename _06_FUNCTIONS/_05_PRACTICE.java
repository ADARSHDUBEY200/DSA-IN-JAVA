import java.util.Scanner;

public class _05_PRACTICE {

    public static int sum(int a, int b){

         int sum =a+b;
         return sum;

    };

    public static int sum(int a,int b,int c){

        int sum = a+b+c;
        return sum;
    };

    public static float sum (float a, float b){
        float sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER TEH VALUE OF A");
         int a= sc.nextInt();
         System.out.println("ENTER THE VALUE OF B");
         int b= sc.nextInt();
         System.out.println("ENTER THE VALUE OF C");
         int c= sc.nextInt();

         System.out.println("THE VALUE OF NUMBERS a AND  b IS :" +sum(a, b));
         System.out.println("THE VALUE OF NUMBERS a AND  c IS :" +sum(a, c));
         System.out.println("THE VALUE OF NUMBERS b AND  c IS :" +sum(b, c));
         System.out.println("THE VALUE OF NUMBER a AND b in FLOAT FORM IS : "+sum(3.2f, 4.8f));
         System.out.println("THE VALUE OF NUMBERS a AND  b,c IS :" +sum(a, b, c));
    }
    

}
