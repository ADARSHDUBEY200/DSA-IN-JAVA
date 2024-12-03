

public class _02_Ith_BIT {

    public static void main(String[] args) {
        
        int num=10;
        int i=2;

        // FINDING ITH BIT OF BINARY NUMNBER S 

        if((num&(1<<i))==0){
            System.out.println("THE REQUIRED BIT IS : 0");

        }else{
            System.out.println("THE REQUIRED BIT IS : 1");
        }

        //SETTING THE ITH BIT

        int num1=num|(1<<i);
        System.out.println(num1);


    }
    
}
