public class buysellstocks {

    public static int calculatemaxprofit(int prices[]) {
        int buyprice = Integer.MAX_VALUE; // tracks lowest buying price
        int maxprofit = Integer.MIN_VALUE; // tracks maximum profit

        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice; // calculate each day profit
                maxprofit = Math.max(maxprofit, profit); // compare maximum profit with daily profit

            } 
            else {// if selling price> buy price
                buyprice = prices[i];
            }
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum Profit= " + calculatemaxprofit(prices));

    }

}
