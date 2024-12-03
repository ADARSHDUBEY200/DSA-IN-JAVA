import java.util.Scanner;

public class _01_QUESTION {

    public static int SumAvg(int n1,int n2,int n3){
        int avg=(n1+n2+n3)/3;
        return avg ;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER 1 ");
        int n1=sc.nextInt();
        System.out.println("ENTER THE NUMBER 2 ");
        int n2=sc.nextInt();
        System.out.println("ENTER THE NUMBER 2");
        int n3=sc.nextInt();

        int AVERAGE=SumAvg( n1,  n2,  n3);
        System.out.println("THE AVERAGE OF THE THREE NUMBER YOU GIVE IS : " +AVERAGE);


    }
    
}
