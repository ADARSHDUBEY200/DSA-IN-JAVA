
public class _02_PALINDROME {
    public static void main(String[] args) {

        String ch = "racpecar";

        int n = ch.length();
        boolean isPlindrome = false;

        for (int i = 0; i <= ch.length() / 2; i++) {
            if (ch.charAt(i) == ch.charAt(ch.length() - 1 - i)) {

                isPlindrome = true;

            } else {
                isPlindrome = false;
                break;
            }
        }

       if(isPlindrome){
        System.out.println("YOUR STRING IS PALINDROME");
       }else{
        System.out.println("YOUR STRING IS NOT A PALINDROME ");
       }
    }

}
