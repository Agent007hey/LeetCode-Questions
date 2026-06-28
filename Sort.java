// LeetCode 75: Sort Colors
// Approach:
// 1. Move all 0s to the beginning.
// 2. Starting from the next available position, move all 1s.
// 3. Remaining elements are automatically 2s.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Sort {
  public static void sortColors(int nums[]) {
    // sorting for zero
    int counter = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        int temp = nums[i];
        nums[i] = nums[counter];
        nums[counter] = temp;
        counter++;
      }
    }
    // 1 color
    for (int i = counter; i < nums.length; i++) {
      if (nums[i] == 1) {
        int temp = nums[i];
        nums[i] = nums[counter];
        nums[counter] = temp;
        counter++;
      }
    }

  }

  public static void main(String[] args) {
    int arr[] = { 2, 0, 1 };
    sortColors(arr);
    for (int item : arr) {
      System.out.print(item + " ");
    }
    System.out.println();
  }
}
