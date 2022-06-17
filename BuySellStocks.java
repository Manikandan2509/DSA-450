public class BuySellStocks {
    public static void main(String[] args) {
        int prices[] = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) { // to Check maximum profit by buying and selling stocks
        int max = 0;
        int left = 0;                    // use 2 pointers left and right
        int right = 1;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[right] - prices[left] <= 0) {
                left = right;              // if (right - left) is less than zero then left =right and right++
                right++;
            } else if (prices[right] - prices[left] > 0) {
                if (prices[right] - prices[left] > max) {
                    max = prices[right] - prices[left];
                }                           // if (right -left)>0 max= (right -left) and right++
                right++;                    // return maximum of max
            }
        }
        return max;
    }
}
