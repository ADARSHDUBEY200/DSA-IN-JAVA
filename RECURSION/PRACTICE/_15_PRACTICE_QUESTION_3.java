public class _15_PRACTICE_QUESTION_3 {

    public static int  LengthString(String str,int index,int count  ){

        //BASE
        if (index==str.length()) {
            return count ;
            
        }

        //KAAM 
        if (str.charAt(0)!='\0') {
            count ++;
            
        }

        int value =LengthString(str, index+1, count);

        return value ;
    }

    public static void main(String[] args) {
        
       int value = LengthString("MY NAME IS ADARSH DUBEY",0,0);

       System.out.println("THE LENGTH OF YOUR STRING IS : "+ value );
    }
    
}
