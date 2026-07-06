/*
 * LeetCode 141 - Linked List Cycle
 *
 * Approach:
 * - Floyd's Cycle Detection Algorithm (Tortoise and Hare)
 * - Use two pointers:
 *      slow -> moves one step at a time
 *      fast -> moves two steps at a time
 * - If a cycle exists, the two pointers will eventually meet.
 * - If fast reaches null, the linked list does not contain a cycle.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class DetectLoop {

  // * Definition for singly-linked list.
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public static boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;

  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    head.next.next.next.next.next = head.next;

    System.out.println(hasCycle(head));
  }
}
