public class LongestCommonPrefix {

  // Approach 1: Horizontal Scanning (Character-by-Character Comparison)
  // Time Complexity: O(n × m)
  // - n = number of strings
  // - m = length of the shortest string (or common prefix)
  // - Compare each string with the current prefix character by character.
  //
  // Space Complexity: O(1)
  // - Uses only a few extra variables.
  public static String longestCommonPrefixByComparison(String str[]) {
    int j = 0;
    String first = str[0];
    for (int i = 1; i < str.length; i++) {
      String second = str[i];
      j = 0;
      while (j < first.length() && j < second.length() && first.charAt(j) == second.charAt(j)) {
        j++;
      }

      first = first.substring(0, j);

    }

    return first;
  }

  // Approach 2: Horizontal Scanning (Prefix Shrinking using startsWith())
  // Time Complexity: O(n × m)
  // - n = number of strings
  // - m = length of the shortest string (or common prefix)
  // - Repeatedly shrink the prefix until the current string starts with it.
  //
  // Space Complexity: O(1)
  // - Uses only a single prefix variable.
  public static String longestCommonPrefixByStartsWith(String str[]) {
    String prefix = str[0];
    for (int i = 1; i < str.length; i++) {
      while (!str[i].startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) {
          return "";
        }
      }
    }
    return prefix;
  }

  public static void main(String[] args) {

    String str[] = { "flower", "flow", "flowht" };
    System.out.println(longestCommonPrefixByComparison(str));
    System.out.println(longestCommonPrefixByStartsWith(str));

  }
}
