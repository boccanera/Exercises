package Leetcode;

import java.util.Arrays;

public class BestTimetoBuyandSellStock2 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        bestTimeToBuy(nums);
        System.out.println(bestTimeToBuy(nums));

    }

    private static int bestTimeToBuy(int[] prices) {

        int profit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) { //1,2,3,4,5

           if (prices[i] - min > 0){
               profit += prices[i] - min;
               min = Integer.MAX_VALUE;
           }

            if (min > prices[i]){
                min = prices[i];
            }


        }

        return profit;
    }

}
