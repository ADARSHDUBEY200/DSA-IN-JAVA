import java.util.Scanner;

public class _02_QUESTION {

   public static boolean isEven( int n){
    if(n%2==0){
        return true;
    }else{
        return false;
    }
   }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUBER YOU WANT O CHECK THAT IT IS EVEN OR NOT ");
        int n=sc.nextInt();

        boolean Value=isEven(n);
        System.out.println("YOR GIVEN NUMBER IS EVEN WHEN THE ANSWER IS TRUE OTHERWISE THE ANSWER IS FALSE :"+Value);

    }
    
}
