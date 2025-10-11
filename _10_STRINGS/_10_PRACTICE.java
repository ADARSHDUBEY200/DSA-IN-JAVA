public class _10_PRACTICE {

    public static void StringCompression(String str){

        StringBuilder sb = new StringBuilder();

        Integer count =0;

        //aaabbcc

        for(int i=0;i<str.length();i++){
            
            count =1;

            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count ++;
                i++;
                
            }

            sb.append(str.charAt(i));

            if (count>1) {
                sb.append(count);
                
            }

        }

        System.out.println(sb);

    }

    public static void main(String[] args) {

        String str = "aaabbbcccdd";

        StringCompression(str);
        
    }
    
}
