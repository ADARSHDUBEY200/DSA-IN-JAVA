public class _17_TILLING_PROBLEM {

    public static int TillingProblem(int n){
        // BASE CASE 
        if(n==1 || n==0){
            return 1 ;
        }

        // VERTICAL WAYS 
        int vertical = TillingProblem(n-1);

        // HORIZONATAL WAYS 
        int horizontal = TillingProblem(n-2);

        int totalWays = vertical + horizontal;

        return totalWays;

    }

    public static void main(String[] args) {

        int value = TillingProblem(4);
        System.out.println("THE TOTAL NO. OF THE WAYS IS : "+value);
        

    }
    
}
