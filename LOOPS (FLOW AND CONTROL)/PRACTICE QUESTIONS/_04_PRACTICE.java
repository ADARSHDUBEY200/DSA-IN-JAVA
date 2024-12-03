import java.util.Scanner;

public class _04_PRACTICE {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT THE MULTIPLICATION OF THAT");
        int n= sc.nextInt();
        System.out.println("THE MULTIPLICATION OF THE GIVEN NUMBER IS ");

        for(int i=1;i<=10;i++){
            
            System.out.println(n+"*"+i+ ": "+n*i);
        }
        


    }
    
}
