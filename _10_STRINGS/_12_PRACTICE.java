import java.util.Scanner;

public class _12_PRACTICE {

    public static int  Anagrams(String str1 ,String str2){
        int checker =0;

        if (str1.length()!=str2.length()) {

            return -1;
            
        }

      

        for(int i=0;i<str1.length();i++){
            char ch =str1.charAt(i);

            for(int j=0;j<str2.length();j++){
                if (ch == str2.charAt(j)) {

                    checker=1;
                    break;
                    
                }
                checker=-1;

            }
        }

        return checker;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE FIRST STRING ");
        String str1 = sc.next();
        System.out.println("ENTER THE SECOND STRING ");
        String str2 = sc.next();

        Anagrams(str1,str2);


        
    }
    
}
