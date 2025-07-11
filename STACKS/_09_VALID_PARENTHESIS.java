import java.util.Stack;

public class _09_VALID_PARENTHESIS {

    public static boolean ValidParentehsis(String str){
        Stack<Character> s = new Stack<>();

        for(int i =0 ; i<str.length(); i++){

            char ch = str.charAt(i);

            // OPENING TAGS OF THE BRACES 
            if(ch == '('|| ch  =='{' || ch  =='['){
                s.push(ch);
            }else {
                if(s.isEmpty()){
                    return false ;
                }

                if((s.peek() == '(' &&  ch == ')') || (s.peek() == '{' &&  ch == '}') || (s.peek() == '[' &&  ch == ']')){
                    s.pop();
                }else {
                       return false ;
                }
            }
        }

        if(s.isEmpty()){
            return true  ;
        }else{
            return false ;
        }
    }

    public static void main(String[] args) {
        
        String str = "(){{[({][][}]})]}}[]]";
        boolean value = ValidParentehsis(str);
        System.out.println("THE STRING OF PARENTHESIS IS VALIS OR NOT : "+value);
    }
    
}
