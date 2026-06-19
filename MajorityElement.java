/*
LeetCode 169. Majority Element

Problem Statement:
Given an integer array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Explanation:
The element 3 appears 2 times, which is more than ⌊3/2⌋ = 1.

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Explanation:
The element 2 appears 4 times, which is more than ⌊7/2⌋ = 3.

Constraints:
1 <= nums.length <= 5 * 10^4
-10^9 <= nums[i] <= 10^9

Approaches Implemented:
1. Brute Force Approach
   - Count frequency of each element using nested loops.
   - Time Complexity: O(n²)
   - Space Complexity: O(1)

2. Optimized Approach (Works for Sorted Array)
   - Count consecutive occurrences.
   - Time Complexity: O(n)
   - Space Complexity: O(1)

3. Moore's Voting Algorithm
   - Finds the majority element in a single traversal.
   - Time Complexity: O(n)
   - Space Complexity: O(1)
*/

public class MajorityElement {

  // BruteForce method
  public static int BruteForce(int nums[]) {
    int n = nums.length;
    for (int val : nums) {

      int freq = 0;
      for (int ele : nums) {
        if (val == ele) {
          freq++;
        }
      }
      if (freq > n / 2) {

        return val;
      }
    }
    return -1;
  }

  // Optimize Method
  public static int Optimize(int nums[]) {
    int n = nums.length;
    int freq = 1;
    int ans = nums[0];
    for (int i = 1; i < n; i++) {
      if (nums[i] == nums[i - 1]) {
        freq++;
      } else {
        freq = 1;
        ans = nums[i];
      }

      if (freq > n / 2) {
        return ans;
      }
    }
    return ans;
  }

  // Moore's Voting Algorithm
  public static int Moore(int nums[]) {
    int ans = 0;
    int freq = 0;
    for (int i = 0; i < nums.length; i++) {
      if (freq == 0) {
        ans = nums[i];
      }
      if (ans == nums[i]) {
        freq++;
      } else {
        freq--;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int nums[] = { 3, 2, 3, 2, 2, 3, 3 };

  }
}
