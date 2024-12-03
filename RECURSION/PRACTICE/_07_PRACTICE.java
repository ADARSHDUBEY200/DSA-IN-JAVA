public class _07_PRACTICE {

    public static int TillingProb(int n ){

        if (n==0||n==1) {
            return 1;
            
        }

        //vertical
        int vertical=TillingProb(n-1);

        //horizontal
        int horizonatl=TillingProb(n-2);




        int Totalways=vertical+horizonatl;
        return Totalways;
    }

    public static void main(String[] args) {

        int ways=TillingProb(4);
        System.out.println(ways);



        
    }
    
}
