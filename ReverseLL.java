/*
 * LeetCode 206 - Reverse Linked List
 *
 * Approach:
 * 1. Initialize three pointers:
 *    - prev: Points to the previous node (initially null).
 *    - curr: Points to the current node (initially head).
 *    - next: Temporarily stores the next node.
 * 2. Traverse the linked list until curr becomes null:
 *    - Save the next node.
 *    - Reverse the current node's next pointer.
 *    - Move prev and curr one step forward.
 * 3. After the traversal, prev points to the new head of the reversed list.
 * 4. Return prev as the new head.
 *
 * Time Complexity: O(n)
 *   - Each node is visited exactly once.
 *
 * Space Complexity: O(1)
 *   - The reversal is performed in-place using constant extra space.
 */

public class ReverseLL {

  // Definition for singly-linked list.
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

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    ListNode next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
    return head;

  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);

    System.out.println("After reverse");
    ListNode reverseHead = reverseList(head);

    while (reverseHead != null) {
      System.out.println(reverseHead.val);
      reverseHead = reverseHead.next;
    }

  }
}
