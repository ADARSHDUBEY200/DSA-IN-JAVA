public class _14_PRACTICE_QUESTION_2 {

    public static StringBuilder Conversion(int n ,StringBuilder newstr){

        //BASE
        if (n==0) {
            
            return newstr.append("");
            
        }



        // FINDING THE LAST DIGIT TO APPEND IN THE STRING
        int lastdigit=n%10;

        // SHORT THE NUMBER TO FINDING ANOTHER LAST DIGIT 
        n=n/10;

        Conversion(n, newstr);

        switch (lastdigit) {
            case 0: newstr.append("Zero"+" ");
                
            break;
            case 1: newstr.append("One"+" ");
                
            break;
            case 2: newstr.append("Two"+" ");
                
            break;
            case 3: newstr.append("Three"+" ");
                
            break;
            case 4: newstr.append("Four"+" ");
                
            break;
            case 5: newstr.append("Five"+" ");
                
            break;
            case 6: newstr.append("Six"+" ");
                
            break;
            case 7: newstr.append("Seven"+" ");
                
            break;
            case 8: newstr.append("Eight"+" ");
                
            break;
            case 9: newstr.append("nine"+" ");
                
                break;
        
            default:
                break;
        }

        return newstr;
    }

    public static void main(String[] args) {
        
         StringBuilder str =Conversion (1940,new StringBuilder());
         System.out.println(str);
    }
    
}
