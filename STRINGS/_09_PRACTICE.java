public class _09_PRACTICE {

    public static void Uppercase(String str){
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));

        sb.append(ch);
        for(int i=1;i<str.length();i++){

            if (str.charAt(i-1)==' ' && i<str.length()) {
                
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            }else{

                sb.append(str.charAt(i));

            }

            
        }

        System.out.println(sb);

      

    }
    public static void main(String[] args) {
        
        String str="hi, i am adarsh";

        Uppercase(str);
    }
    
}
