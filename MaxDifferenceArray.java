/*
 Question:
 You are given an array prices where prices[i] is the price of a stock on day i.
 Choose one day to buy and another day in the future to sell.
 Return the maximum profit you can achieve.
 If no profit is possible, return 0.

 Example:
 Input: prices = [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy at 1 and sell at 6
*/

class BestTimeToBuySellStock {

    // Function to calculate maximum profit
    public static int maxProfit(int[] prices) {

        int minPrice = prices[0]; // minimum price so far
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Update minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    // Main method
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
