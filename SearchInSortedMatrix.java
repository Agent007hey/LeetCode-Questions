public class SearchInSortedMatrix {
  public static boolean Search(int matrix[][], int target) {
    int startRow = 0;
    int startCol = matrix[0].length - 1;

    while (startRow != matrix.length && startCol >= 0) {
      if (matrix[startRow][startCol] == target) {
        return true;
      } else if (matrix[startRow][startCol] > target) {
        startCol--;
      } else {
        startRow++;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
    int target = 10;
    System.out.println(Search(matrix, target));

  }
}