
public class _03_PRACTICE {

    public static void main(String[] args) {
        
        int year=2016;

        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0) {
                    System.out.println("the year is leap year");
                    
                }else{
                    System.out.println("not a leap year");
                }
                
            }else{
                System.out.println("the year is leap year");
            }
            
        }else{
            System.out.println("the year is not a leap year");
        }
    }
    
}
