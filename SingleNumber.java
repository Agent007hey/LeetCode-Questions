/*
 * LeetCode: 136. Single Number
 *
 * Problem:
 * Given a non-empty array of integers where every element appears twice
 * except for one, find that single element.
 *
 * Example:
 * Input:  [4, 1, 2, 1, 2]
 * Output: 4
 *
 * Approach:
 * - Use the XOR (^) operator.
 * - XOR of a number with itself is 0.
 * - XOR of a number with 0 is the number itself.
 * - Therefore, all duplicate elements cancel out, leaving only the
 *   element that appears once.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SingleNumber {

  public static int CheckBit(int nums[]) {
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      ans = ans ^ nums[i];
    }

    return ans;
  }

  public static void main(String[] args) {
    int nums[] = { 4, 1, 2, 1, 2 };

    System.out.println(CheckBit(nums));

  }
}