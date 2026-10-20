package week1.Day5;

public class buySellStocks {

    public static void main(String[] args) {
        int[] prices={7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        // TODO Auto-generated method stub
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-minprice;
            maxprofit=Math.max(maxprofit, profit);
            minprice=Math.min(prices[i], minprice);
        }



        return maxprofit;

    }
    
}
