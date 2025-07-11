public class _09_Duplicates_Strings {

    public static void Duplicates(String str, int idx , StringBuilder newstr, boolean map[]){
        
       //base case 

       if (idx==str.length()) {
        System.out.println(newstr);
        return;
        
       }

       //work or kaam 
       char currChar= str.charAt(idx);

       if (map[currChar-'a']==true) {

        Duplicates(str, idx+1, newstr, map);
        
       }else{

        map[currChar-'a']=true;
        Duplicates(str, idx+1, newstr.append(currChar), map);
       };


    }

    public static void main(String[] args) {
        
        String str="appnnacollege";
        Duplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
    
}
