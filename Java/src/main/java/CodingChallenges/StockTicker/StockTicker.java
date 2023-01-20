package CodingChallenges.StockTicker;

import java.util.Arrays;

public class StockTicker {

    /**
     * You recieve an array of doubles, which represent the sequential prices of a stock throughout the day.
     * Your task is to return a string containing the best index to buy 1 stock and the best index to sell that same
     * stock in order to maximize profit on the buying and selling of that one stock.
     * You can assume that the stock price increases compared to the previous hour at some point in the day.
     *
     * Example output:
     *
     * Buy 4 Sell 21
     * Buy 19 Sell 23
     * Buy 3 Sell 4
     *
     * note: time does not flow backwards. The test cases will only use unambiguous answers, ie there is only
     * one best answer for all the test cases.
     *
     * @param input an array of stock prices represented by ints
     * @return the buy index as formatted above, followed by the sell index as formatted above.
     */
    public String getBuySellTimes(int[] input){

        //the goal is to find the biggest difference between 2 numbers, max and min doesn't necessarily matter
        //the number can't be negative (the min cannot come after the max)

        int profit = Integer.MIN_VALUE;
        int buyIndex = 0;
        int sellIndex = 0;

        for(int i = 0; i < input.length-1; i++){
            for(int j = i+1; j < input.length; j++){
                int checkProfit = input[j] - input[i];

                if(checkProfit > profit){
                    profit = checkProfit;
                    buyIndex = i;
                    sellIndex = j;
                }
            }
        }

        return "Buy " +buyIndex +" Sell " +sellIndex;
    }
}
