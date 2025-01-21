
public class _02_FIND_SUBSETS {

    public static void FindSubsets(String str, String ans , int i){
        // BASE CASE 
        if(i>=str.length()){

            System.out.println(ans);
            return ;
        }

        // WORK 
        // yes part 
        FindSubsets(str,ans+str.charAt(i),i+1);

        // no part 
        FindSubsets(str, ans, i+1);
        

        // BELIVE IN THE INNER FUNCTION CALL 

    }

    public static void main(String[] args) {
        

        String str = "abc";

        FindSubsets(str,"",0 );
    }
    
}
