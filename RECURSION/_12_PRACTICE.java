public class _12_PRACTICE {

    public static int  LenghtOfString(String str, int index , int count ){
        if(index== str.length()){
            return count ;
        }

        return LenghtOfString(str, index+1, count+1);

    }

    public static void main(String[] args) {
        
        String str = "adarsh";

        int value = LenghtOfString(str, 0, 0);

        System.out.println("THE LENGHT OF THE STRING IS : "+value);
    }
    
}
