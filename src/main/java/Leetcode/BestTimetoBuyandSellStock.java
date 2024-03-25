package Leetcode;

public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {

        int[] nums = {1,5,3,6};

        System.out.println(bestBuy(nums));

    }

    private static int bestBuy(int[] prices) {

        int min = Integer.MAX_VALUE;
        int profitHolder = 0;

        for (int i = 0; i < prices.length; i++) {

            if ( prices[i] < min ){
                min = prices[i];
                continue;
            }  if (prices[i] - min > profitHolder){
                profitHolder = prices[i] - min;
            }

        }
        return profitHolder;
    }
}

//            if(prices[i] > max){
//                max = prices[i];
//            }
//
//            if (min == 0 && prices[i] > 0){
//                min = prices[i];
//            }
//
//            if(prices[i] < min){
//                min = prices[i];
//                max = min;
//            }

