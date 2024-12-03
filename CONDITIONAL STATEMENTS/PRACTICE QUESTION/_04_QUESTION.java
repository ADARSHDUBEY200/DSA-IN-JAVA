import java.util.*;
public class _04_QUESTION {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int year= sc.nextInt();

        if(year%4==0){
            System.out.println("THIS YEAR IS LEAP YEAR"+year);
        }else{
            System.out.println("THIS IS NOT A LEAP YEAR");
        }
    }
    
}
