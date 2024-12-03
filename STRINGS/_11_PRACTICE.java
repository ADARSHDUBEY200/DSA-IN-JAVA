import java.util.Scanner;

public class _11_PRACTICE {

    public static int  LowercaseChecker(String str ){
        // StringBuilder sb = new StringBuilder();

        int count =0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i' || str.charAt(i)=='o'||str.charAt(i)=='u'){

                count ++;

            }
        }//o(n)

        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int value =LowercaseChecker(str);
        System.out.println("THE NUMBER OF LOWERCASE VOWELS IN YOUR GIVEN STRING IS : "+value);
    }
    
}
