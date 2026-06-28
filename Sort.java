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
