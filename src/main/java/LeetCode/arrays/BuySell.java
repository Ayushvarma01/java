package LeetCode.arrays;

public class BuySell {

	public int maxProfit(int[] prices) {
		int minProfit = prices[0];
		int max = 0;
		int first = 0;
		for (int i = 1; i < prices.length; i++) {
			first = prices[i];
			if (first < minProfit) {
				minProfit = first;
			}
			int total = first - minProfit;
			if (total > max) {
				max = total;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 3, 6, 4 };
//		int arr[] = { 2, 1, 4 };
		BuySell buySell = new BuySell();
		System.out.println(buySell.maxProfit(arr));
	}
}
