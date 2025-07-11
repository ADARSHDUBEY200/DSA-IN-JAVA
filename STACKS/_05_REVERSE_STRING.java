import java.util.Stack;
public class _05_REVERSE_STRING {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();

        for(int idx =0 ; idx < str.length();idx++){
            s.push(str.charAt(idx));
        }

        StringBuilder newStr = new StringBuilder("");

        while(!s.isEmpty()){
            char value = s.pop();
            newStr.append(value);
        };

         return newStr.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String str = "adarsh";

        String result = reverseString(str);
        System.out.println("THE REVERSED STRING IS : "+result );
    }
    
}
