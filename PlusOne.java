/*
* LeetCode 66 - Plus One
*
* Problem:
* Given an integer represented as an array of digits, increment the integer by one
* and return the resulting array.
*
* Example:
* Input:  [1,2,3]
* Output: [1,2,4]
*
* Input:  [4,3,2,9]
* Output: [4,3,3,0]
*
* Input:  [9,9,9]
* Output: [1,0,0,0]
*
* Approach:
* 1. Traverse the array from the last digit.
* 2. If the current digit is less than 9:
*      - Increment it by 1.
*      - Return the updated array.
* 3. If the current digit is 9:
*      - Change it to 0.
*      - Continue to the previous digit (carry).
* 4. If every digit is 9, create a new array of size n + 1.
*      - Place 1 at the first position.
*
* Time Complexity: O(n)
* Worst case occurs when all digits are 9.
*
* Space Complexity: O(1) Auxiliary Space
* A new array is created only when all digits are 9, which is required for the output.
*/

import java.util.Arrays;

public class PlusOne {

  // Function to add one to the number
  public static int[] plusOne(int[] digits) {

    // Traverse from the last digit to the first
    for (int i = digits.length - 1; i >= 0; i--) {

      // If digit is less than 9, simply increment it
      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }

      // If digit is 9, make it 0 and carry moves left
      digits[i] = 0;
    }

    // If all digits were 9, create a new array
    int[] result = new int[digits.length + 1];
    result[0] = 1;

    return result;
  }

  public static void main(String[] args) {

    int[] digits1 = { 1, 2, 3 };
    System.out.println("Input : " + Arrays.toString(digits1));
    System.out.println("Output: " + Arrays.toString(plusOne(digits1)));

  }
}
