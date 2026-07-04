import java.util.Arrays;

public class ValidAnagram {

  // Approach 1: Sorting
  // Time Complexity: O(n log n)
  // - Converting both strings to character arrays takes O(n).
  // - Sorting each character array takes O(n log n).
  // - Comparing both sorted arrays takes O(n).
  // Overall Time Complexity: O(n log n)
  //
  // Space Complexity: O(n)
  // - Two character arrays of size n are created.

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] arr = s.toCharArray();
    char[] arr2 = t.toCharArray();
    Arrays.sort(arr);
    Arrays.sort(arr2);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != arr2[i]) {
        return false;
      }
    }
    return true;

  }

  // Approach 2: Character Frequency Count
  // Time Complexity: O(n)
  // - Traverse both strings once to update the frequency array.
  // - Traverse the frequency array of size 26 (constant time).
  // Overall Time Complexity: O(n)
  //
  // Space Complexity: O(1)
  // - Uses a fixed-size integer array of length 26.

  public static boolean Check(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int count[] = new int[26];

    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
      count[t.charAt(i) - 'a']--;
    }

    for (int cot : count) {
      if (cot != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    String s = "abagram";
    String t = "naagram";
    System.out.println(Check(s, t));
    System.out.println(isAnagram(s, t));
  }
}
