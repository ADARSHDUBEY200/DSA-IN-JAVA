import java.util.*;

public class _05_INCOME_TAX_CALCULATOR {
    public static void main(String[] args) {
        
        Scanner sc=  new Scanner(System.in);
        int income=sc.nextInt();
        int tax;

        if(income<=500000){
            tax=0;
        }else if(income>500000 && income<=1000000){
            tax=(int)(income*0.2);
        }else if(income> 1000000){
            tax=(int)(income*0.3);
        }else{
            System.out.println("YOUR ENTERY IS INVALID");
            tax=0;
        }

        System.out.println("YOUR TAX ON YOUR INCOME IS " +tax);

    }
    
}
