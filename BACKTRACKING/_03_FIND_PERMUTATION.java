import java.io.FileNotFoundException;

public class _03_FIND_PERMUTATION {

    public static void FindPermutation(String str,String ans){

        //BASE CASE 
        if (str.length()==0) {
            System.out.println(ans);
            return ;
            
        }


        //KAAM 
        for (int i=0;i<=str.length()-1;i++){
            char  curr=str.charAt(i);
             String NewStr = str.substring(0,i)+str.substring(i+1);
             FindPermutation(NewStr, ans+curr);
            }

          
    }

    public static void main(String[] args) {
        
        String str= "abc";
        FindPermutation(str,"");
    }
    
}
