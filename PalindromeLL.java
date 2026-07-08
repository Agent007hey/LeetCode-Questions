public class PalindromeLL {

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

  // Finding the mid
  public static ListNode findMidNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  // boolean now check
  public static boolean check(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }

    // find mid
    ListNode mid = findMidNode(head);
    // reverse
    ListNode curr = mid;
    ListNode prev = null;
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    ListNode right = prev;
    ListNode left = head;

    // check if equal
    while (right != null) {
      if (left.val != right.val) {
        return false;
      }
      left = left.next;
      right = right.next;
    }

    return true;

  }

  public static void PrintLL(ListNode head) {
    while (head != null) {
      System.out.println(head.val);
      head = head.next;
    }
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(3);
    head.next.next = new ListNode(5);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(1);
    // head.next.next.next.next.next = new ListNode(1);

    System.out.println(
        check(head)

    );

  }

}
