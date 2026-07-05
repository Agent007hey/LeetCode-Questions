/*
 * Approach:
 * 1. Traverse the linked list once to calculate its length.
 * 2. Compute the middle index using length / 2.
 * 3. Traverse the list again until the middle index.
 * 4. Return the middle node.
 *
 * Note:
 * - For an odd-length list, the exact middle node is returned.
 * - For an even-length list, the second middle node is returned,
 *   as required by the LeetCode problem.
 *
 * Time Complexity: O(n)
 *   - First traversal to calculate the length: O(n)
 *   - Second traversal to reach the middle: O(n/2)
 *   - Overall: O(n)
 *
 * Space Complexity: O(1)
 *   - No extra data structures are used.
 */

public class MiddleOfLL {

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    // head.next.next.next.next.next = new ListNode(6);

    // Calculating the size;
    ListNode current = head;
    int size = 0;
    while (current != null) {
      size++;
      current = current.next;
    }

    // mid
    int mid = size / 2;
    ListNode check = head;
    for (int i = 0; i < mid; i++) {
      check = check.next;
    }

    while (check != null) {
      System.out.println(check.val);
      check = check.next;

    }

  }
}
