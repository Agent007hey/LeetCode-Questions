/*
 * LeetCode 167 - Two Sum II: Input Array Is Sorted
 *
 * Problem:
 * Given a 1-indexed integer array `numbers` sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target.
 *
 * Return the indices (1-based) of the two numbers as an array of size 2.
 * It is guaranteed that exactly one solution exists, and the same element
 * cannot be used twice.
 *
 * Example:
 * Input:  numbers = [2, 7, 11, 15], target = 9
 * Output: [1, 2]
 *
 * Approach:
 * Since the array is already sorted, use the Two Pointer technique.
 * - Start one pointer from the beginning and another from the end.
 * - If the sum is equal to the target, return the 1-based indices.
 * - If the sum is greater than the target, move the right pointer left.
 * - If the sum is smaller than the target, move the left pointer right.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * LeetCode: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */

public class TwoSumSortedArray {

  public static int[] solution(int arr[], int targte) {
    int ans[] = new int[2];
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      if (arr[start] + arr[end] == targte) {
        ans[0] = start + 1;
        ans[1] = end + 1;
        return ans;
      } else if (arr[start] + arr[end] > targte) {
        end--;
      } else {
        start++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 7, 11, 15 };
    int target = 9;
    int ans[] = solution(arr, target);

    for (int i = 0; i < 2; i++) {
      System.out.print(ans[i] + " ");

    }

  }
}