/*
LeetCode 121 - Best Time to Buy and Sell Stock

Problem:
You are given an array prices where prices[i] is the price of a stock on the ith day.
Choose a single day to buy one stock and a different future day to sell that stock.
Return the maximum profit you can achieve. If no profit is possible, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation:
Buy on day 2 (price = 1) and sell on day 5 (price = 6).
Profit = 6 - 1 = 5.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation:
No profitable transaction is possible.

Approach:
1. Track the minimum stock price seen so far (cp = cost price).
2. Calculate the profit for each day by selling on that day.
3. Update the maximum profit whenever a larger profit is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class BuySellStock {

  public static int Stock(int arr[]) {
    int cp = Integer.MAX_VALUE;
    int profit = 0;
    for (int i = 0; i < arr.length; i++) {
      cp = Math.min(cp, arr[i]);
      int maxprofit = arr[i] - cp;
      profit = Math.max(maxprofit, profit);
    }
    return profit;
  }

  public static void main(String[] args) {
    int arr[] = { 7, 6, 4, 3, 1 };
    System.out.println(Stock(arr));
  }
}