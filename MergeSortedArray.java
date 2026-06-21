import java.util.Arrays;

public class MergeSortedArray {

  // LeetCode 88: Merge Sorted Array
  // Brute Force Approach:
  // 1. Copy all elements of nums2 into the empty spaces of nums1.
  // 2. Sort the entire nums1 array.
  //
  // Time Complexity: O((m + n) log(m + n))
  // Space Complexity: O(1) (Ignoring the space used by the sorting algorithm)
  public static void BruteForce(int nums1[], int m, int nums2[], int n) {

    for (int i = m; i < nums1.length; i++) {
      nums1[i] = nums2[i - m];
    }

    Arrays.sort(nums1);

  }

  // Optimized Two-Pointer Approach:
  // 1. Start comparing elements from the end of both arrays.
  // 2. Place the larger element at the last available position in nums1.
  // 3. Continue until all elements of nums2 are merged.
  //
  // Time Complexity: O(m + n)
  // Space Complexity: O(1)
  public static void Merge(int nums1[], int m, int nums2[], int n) {
    int idx = n + m - 1;
    int i = m - 1;
    int j = n - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[idx] = nums1[i];
        idx--;
        i--;
      } else {
        nums1[idx] = nums2[j];
        idx--;
        j--;
      }
    }

    // loop for extra element which are in nums2[]
    while (j >= 0) {
      nums1[idx] = nums2[j];
      idx--;
      j--;
    }
  }

  public static void main(String[] args) {
    int nums1[] = { 1, 2, 3, 0, 0, 0 };
    int m = 3;
    int nums2[] = { 2, 5, 6 };
    int n = 3;

    // BruteForce(nums1, m, nums2, n);
    Merge(nums1, m, nums2, n);
    for (int item : nums1) {
      System.out.print(item + " ");
    }
  }
}
