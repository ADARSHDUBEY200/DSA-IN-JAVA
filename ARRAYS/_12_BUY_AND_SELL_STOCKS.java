public class _12_BUY_AND_SELL_STOCKS {

    public static void main(String[] args) {
        
        int stocks[]={7,1,5,3,6,4};

        int Prev_Min_Price=Integer.MAX_VALUE;
        int Todays_Price;
        int Max_Profit=Integer.MIN_VALUE;
        int Day_Sell=0;

        for(int i=0;i<=stocks.length-1;i++){
            
            if(i==0){

                Todays_Price=stocks[i];
            }else{
                Prev_Min_Price=i==1?stocks[i-1]:Math.min(stocks[i-1],Prev_Min_Price);

                Todays_Price=stocks[i];

                int Curr_Profit=Todays_Price - Prev_Min_Price;

                if(Max_Profit<Curr_Profit){
                    Max_Profit=Curr_Profit;
                     Day_Sell=i;
                }
            }

        }

        int Day_Buy=0;

        for(int i=0;i<=stocks.length-1;i++){

            if(stocks[i]==Prev_Min_Price){
                 Day_Buy=i;
            }
        }

        System.out.println("SO THE DAY AT WHICH YOU CAN BUY STOCKS FOR MAKING MAXIMUM PROFIT  : "+Day_Buy);

        System.out.println("PRICE OF THE STOCK AT THE DAY OF BUY IS : " +stocks[Day_Buy]);

        System.out.println("THE DAY AT WHICH YOU CAN SELL STOCKS FOR MAKING MAXIMUM PROFIT IS : "+Day_Sell);

        System.out.println("PRICE OF THE STOCK AT THE DAY OF SELL IS : "+stocks[Day_Sell]);

        System.out.println("SO THE MAXIMUM PROFIT YOU GAIN FROM BUYING AND SELLING THE STOCKS FROM THESES DAYS IS : "+Max_Profit);
    }
    
}
