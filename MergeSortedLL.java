
public class MergeSortedLL {

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

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode dummy = new ListNode(-1);
    ListNode temp = dummy;

    while (list1 != null && list2 != null) {

      if (list1.val <= list2.val) {
        temp.next = list1;
        list1 = list1.next;
      } else {
        temp.next = list2;
        list2 = list2.next;
      }

      temp = temp.next;
    }

    temp.next = (list1 != null) ? list1 : list2;

    return dummy.next;
  }

  public static void printList(ListNode head) {
    while (head != null) {
      System.out.print(head.val + " ");

      head = head.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // list1 = 1 -> 3 -> 5 -> 7
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(3);
    list1.next.next = new ListNode(5);
    list1.next.next.next = new ListNode(7);

    // list2 = 2 -> 4 -> 6 -> 8
    ListNode list2 = new ListNode(2);
    list2.next = new ListNode(4);
    list2.next.next = new ListNode(6);
    list2.next.next.next = new ListNode(8);

    System.out.println("List 1: ");
    printList(list1);

    System.out.println("List 2: ");
    printList(list2);

    ListNode merged = mergeTwoLists(list1, list2);
    System.out.println("Merged List:");
    printList(merged);

  }
}
