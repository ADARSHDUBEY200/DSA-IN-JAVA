import java.sql.Time;

public class _02_PRACTICE {

    public static void main(String[] args) {
        

        for(int i =0 ; i< 9 ; i++ ){
            System.out.println("THE LOOP IS NOW RUUNING AT THE SPEED "+i);
            if(i == 6 ){
                System.out.println("NOW I AM BREAKING : "+i);
                break ;
            }
        }

        System.out.println();

        for(int i =0 ; i< 9 ; i++ ){
            System.out.println("THE LOOP IS NOW RUUNING AT THE SPEED "+i);
            if(i == 6 ){
                System.out.println("NOW I AM CONTINUE : "+i);

                continue ; // BASICALLY COTINUE SKIP THE LINE UNDER IT AND START FROM THE NEXT POINT 
            }

            System.out.println("I ma after the continue : "+i);
        }

        



    }
    
}
