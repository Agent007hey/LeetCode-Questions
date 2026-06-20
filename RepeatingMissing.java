public class RepeatingMissing {

  public static int[] findMissingAndRepeatedValues(int grid[][]) {
    int ans[] = new int[2];
    int n = grid.length;
    boolean check[] = new boolean[n * n + 1];

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        int curr = grid[i][j];

        if (check[curr] == true) {
          ans[0] = curr;

        } else {
          check[curr] = true;
        }
      }
    }

    // missing
    for (int i = 1; i < check.length; i++) {
      if (!check[i]) {
        ans[1] = i;
        break;
      }
    }

    return ans;
  }

  public static void main(String[] args) {

    int grid[][] = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
    int arr[] = findMissingAndRepeatedValues(grid);
    for (int i = 0; i < 2; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}