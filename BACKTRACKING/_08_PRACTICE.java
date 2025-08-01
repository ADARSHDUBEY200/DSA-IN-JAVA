public class _08_PRACTICE {

    public static void FindPermutation(String str , String ans ){

        // BASE CASE 
        if(str.length() == 0){
            System.out.println(ans );
            return ; 
        }

        // WORK 
        for(int i=0 ; i< str.length(); i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            FindPermutation(NewStr, ans+curr);
        }

        // BELIVE IN THE INNER FUNCTION CALL 

    }

    public static void main(String[] args) {
        
        String str = "abc";

        FindPermutation(str,"");
    }
    
}
