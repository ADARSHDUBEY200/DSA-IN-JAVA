public class _10_BUY_SELL_STOCK {

    public static int BuySellStock(int arr []){
        // Auxilary for the storing the index of the max stock price day for selling the stock 

        int largeStock [] = new int[arr.length];
        
        for(int i =arr.length-1 ; i>=0 ; i--){

            if(i== arr.length-1 ){
                largeStock[i]= arr[i];
            }else{
                if(largeStock[i+1] < arr[i]){
                    largeStock[i] = arr[i];
                }else{
                    largeStock[i] =largeStock[i+1];
                }
            }

        }

        int maxProfit = Integer.MIN_VALUE;

        for(int i =0 ; i< arr.length ; i++){
            int profit = largeStock[i] -arr[i];
            
            if(maxProfit < profit ){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        
        int prices [] ={7,1,5,3,6,4};
        int value =BuySellStock(prices);
        System.out.println("THE MAXIMUM PROFIT WE CAN ACHIEVE IS : "+value );
    }
    
}
