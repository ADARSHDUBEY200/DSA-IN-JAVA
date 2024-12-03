public class _16_PRACTICE {

    public static int  SUBSTRING(String str , int begin , int end , int count ){

        if (end == str.length()+1) {
            return count ;
            
        }

        if (begin==str.length()+1) {
            return count;
            
        }

        char firstChar=str.substring(begin, end).charAt(0);
        char lastChar=str.substring(begin, end).charAt(str.substring(begin, end).length()-1);



        //KAAM 
        if (firstChar==lastChar ) {

            count ++;
            
        }

       int value1 = SUBSTRING(str, begin, end+1, count);

        int value2=SUBSTRING(str, begin+1, end+1, count);

        int totalSubstring = value1+value2;

        return totalSubstring;
    }

    public static void main(String[] args) {
        
        int value =SUBSTRING("aba",0,1,0);

        System.out.println("THE SUBSTRING EHICH HAVE THIS COPNDIYION IS : "+value );

        // System.out.println("aba".substring(0,2));
    }
    
}
