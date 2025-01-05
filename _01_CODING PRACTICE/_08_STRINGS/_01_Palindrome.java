
public class _01_Palindrome {

    public static void Palindrome(String str ){

        boolean isPlain = true ;


        for(int i =0; i<(str.length()/2);i++){

            if (str.charAt(i)!= str.charAt(str.length()-1-i)) {

                isPlain=false ;
                System.out.println("THE STRING IS  NOT  PALINDROME ");
            }
        }

        if (isPlain) {

            System.out.println("THE STRING IS PALIN DROME");
            
        }

    }

    public static void main(String[] args) {
        
        String str = "racecar";

        Palindrome(str);
    }
    
}
