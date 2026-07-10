/*
 * LeetCode 912 - Sort an Array
 *
 * Problem:
 * Given an integer array nums, sort the array in ascending order and return it.
 * You must solve the problem without using any built-in sorting functions.
 *
 * Approach:
 * - Use Merge Sort (Divide and Conquer).
 * - Recursively divide the array into two halves until each subarray contains
 *   only one element.
 * - Merge the sorted halves by comparing elements and storing them in a
 *   temporary array.
 * - Copy the merged result back to the original array.
 *
 * Time Complexity:
 * Best Case   : O(n log n)
 * Average Case: O(n log n)
 * Worst Case  : O(n log n)
 *
 * Space Complexity:
 * O(n) for the temporary array used during merging.
 * O(log n) recursion stack.
 */

import java.util.Arrays;

public class MergeSort {

  // Function to sort the array
  public static int[] sortArray(int[] nums) {
    mergeSort(nums, 0, nums.length - 1);
    return nums;
  }

  // Recursive Merge Sort
  private static void mergeSort(int[] nums, int low, int high) {

    // Base case: If the array contains only one element
    if (low >= high) {
      return;
    }

    // Find the middle index
    int mid = low + (high - low) / 2;

    // Sort the left half
    mergeSort(nums, low, mid);

    // Sort the right half
    mergeSort(nums, mid + 1, high);

    // Merge the two sorted halves
    merge(nums, low, mid, high);
  }

  // Merge two sorted halves
  private static void merge(int[] nums, int low, int mid, int high) {

    // Temporary array to store merged elements
    int[] temp = new int[high - low + 1];

    int left = low;
    int right = mid + 1;
    int index = 0;

    // Compare elements from both halves
    while (left <= mid && right <= high) {

      if (nums[left] <= nums[right]) {
        temp[index++] = nums[left++];
      } else {
        temp[index++] = nums[right++];
      }
    }

    // Copy remaining elements from the left half
    while (left <= mid) {
      temp[index++] = nums[left++];
    }

    // Copy remaining elements from the right half
    while (right <= high) {
      temp[index++] = nums[right++];
    }

    // Copy merged elements back into the original array
    for (int i = 0; i < temp.length; i++) {
      nums[low + i] = temp[i];
    }
  }

  public static void main(String[] args) {

    int[] nums = { 5, 2, 3, 1 };

    System.out.println("Original Array:");
    System.out.println(Arrays.toString(nums));

    sortArray(nums);

    System.out.println("Sorted Array:");
    System.out.println(Arrays.toString(nums));
  }
}