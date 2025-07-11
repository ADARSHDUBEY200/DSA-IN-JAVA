public class _13_PRACTICE {

    public static void SubString(String str ){

        for(int i=0 ; i < str.length() ; i++){
           
            SubStringUtil(str, i, new StringBuilder(""));
        }
    }

    public static void SubStringUtil(String str , int index , StringBuilder newStr){

        if(index == str.length()){
            return ;
        }

        
        char curr = str.charAt(index);
        System.out.print(newStr.append(curr)+" ");
        SubStringUtil(str, index+1 , newStr);
    }

    public static void main(String[] args) {
        
        String str = "abcab";
        SubString(str);
    }
    
}
