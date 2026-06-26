/*
 * LeetCode 53 - Maximum Subarray
 *
 * Problem:
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum,
 * and return its sum.
 *
 * Example:
 * Input:  nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation:
 * The subarray [4, -1, 2, 1] has the largest sum = 6.
 *
 * Approach:
 * - Use Kadane's Algorithm.
 * - At each index, decide whether to:
 *   1. Start a new subarray from the current element.
 *   2. Extend the previous subarray.
 * - Keep track of the maximum subarray sum found so far.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class KadaneAlgo {
  public static int Kadane(int nums[]) {
    int currSum = 0;
    int MaxSum = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      currSum = Math.max(nums[i], currSum + nums[i]);
      MaxSum = Math.max(MaxSum, currSum);
    }

    return MaxSum;
  }

  public static void main(String[] args) {
    int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(Kadane(nums));
  }
}