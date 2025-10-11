import java.util.Scanner;

public class _04_PRACTICE {

    public static void GETITHBIT(int num,int bit ){

        int bitMask=1<<bit;
        System.out.println(bitMask);

        int value = num & bitMask;
        System.out.println("THE VALUE OF THE GRTTING BIT IS : "+value);

    }

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER THE NUMBER YOU WANT TO ENTER");
      int num =sc.nextInt();
      System.out.println("ENTER THE BIT NUMBER YOU WANT TO KNOW REMEMBER IT IS 0 BASED INDEXING ");
      int bit=sc.nextInt();

      GETITHBIT(num,bit);

    }
    
}
