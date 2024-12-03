import java.util.*;

public class _01_EVEN_ODD {

    public static void BitEvenOdd(int key){

        if((key&1)==1){
            System.out.println("your number is odd ");

        }else{
            System.out.println("your number is even");
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO FIND ABOUT THAT THIS IS EVEN OR ODD");
        int key=sc.nextInt();

        BitEvenOdd(key);
    }
    
}
