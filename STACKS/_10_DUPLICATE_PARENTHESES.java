import java.util.Stack;

public class _10_DUPLICATE_PARENTHESES {

    public static boolean DuplicateParentheses(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (currChar == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true;
                }else{
                    s.pop();
                }

            } else {
                s.push(str.charAt(i));
            }
        }

       return false ;
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";

        boolean value = DuplicateParentheses(str);
        System.out.println("THE STRING IS DUPLICATE OR NOT : " + value);
    }

}
