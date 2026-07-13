public class MedianOfTwoSortedArr {

  /*
   * LeetCode 4 - Median of Two Sorted Arrays
   *
   * Approach:
   * 1. Merge both sorted arrays into a single sorted array using two pointers.
   * 2. Compute the median from the merged array.
   *
   * Time Complexity: O(m + n)
   * Space Complexity: O(m + n)
   *
   * Note:
   * LeetCode asks for an O(log(m+n)) solution.
   * This merge-based approach is easier to understand but is not the optimal
   * solution.
   */
  public static double ans(int nums1[], int nums2[]) {

    int total[] = new int[nums1.length + nums2.length];

    int firstPointer = 0;
    int secondPointer = 0;
    int totalPointer = 0;

    while (firstPointer < nums1.length && secondPointer < nums2.length) {
      if (nums1[firstPointer] <= nums2[secondPointer]) {
        total[totalPointer] = nums1[firstPointer];
        totalPointer++;
        firstPointer++;
      } else {
        total[totalPointer] = nums2[secondPointer];
        totalPointer++;
        secondPointer++;
      }
    }
    // first arr is not empty
    while (firstPointer < nums1.length) {
      total[totalPointer] = nums1[firstPointer];
      totalPointer++;
      firstPointer++;
    }

    // second arr is not empty
    while (secondPointer < nums2.length) {
      total[totalPointer] = nums2[secondPointer];
      totalPointer++;
      secondPointer++;

    }

    int mid = total.length / 2;
    if (total.length % 2 == 0) {

      return (double) (total[mid] + total[mid - 1]) / 2;
    } else {
      return total[mid];
    }

  }

  public static void main(String[] args) {
    int nums1[] = { 1, 3 };
    int nums2[] = { 2 };

    System.out.println(
        ans(nums1, nums2)

    );

  }
}
