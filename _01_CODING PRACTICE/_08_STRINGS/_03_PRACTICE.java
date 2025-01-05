
public class _03_PRACTICE {

    public static void main(String[] args) {

        String str = "hi, i am shraddha";
        
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        System.out.println(sb);

    

        for ( int i=1; i<str.length();i++){
            if (str.charAt(i-1)==' ' && i<str.length()) {

                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
                
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    
}
