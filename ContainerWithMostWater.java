/*
 * LeetCode 11 - Container With Most Water
 *
 * Approach:
 * - Use the Two Pointer technique.
 * - Initialize one pointer at the beginning and another at the end of the array.
 * - At each step:
 *      1. Calculate the width between the two pointers.
 *      2. The container's height is determined by the shorter of the two lines.
 *      3. Compute the water stored and update the maximum water if necessary.
 * - Move the pointer pointing to the shorter line inward because:
 *      - The shorter line limits the container's height.
 *      - Moving the taller line only decreases the width without increasing the height.
 *      - Moving the shorter line may find a taller line and potentially increase the area.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ContainerWithMostWater {

  public static int maxArea(int height[]) {
    int left = 0;
    int right = height.length - 1;

    int maxWater = Integer.MIN_VALUE;
    while (left < right) {

      int width = right - left;

      int containerHeight = Math.min(height[left], height[right]);

      int water = width * containerHeight;
      maxWater = Math.max(maxWater, water);

      if (height[left] > height[right]) {
        right--;
      } else {
        left++;
      }
    }
    return maxWater;
  }

  public static void main(String[] args) {
    int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(maxArea(height));
  }
}