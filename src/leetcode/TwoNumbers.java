package leetcode; /**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-30
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class TwoNumbers {
  static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
    }
  }

  public static void main(String[] args) {
    ListNode a1 = new TwoNumbers.ListNode(9);
    ListNode a2 = new TwoNumbers.ListNode(9);
//    ListNode a3 = new ListNode(3);
    a1.next = a2;
//    a2.next = a3;
    /* 342 */

    ListNode t = a1;
    while (t != null) {
      System.out.print(t.val + " ");
      t = t.next;
    }
    System.out.println();

    ListNode b1 = new ListNode(1);
//    ListNode b2 = new ListNode(6);
//    ListNode b3 = new ListNode(4);
//    b1.next = b2;
//    b2.next = b3;
    /* 465 */

    t = b1;
    while (t != null) {
      System.out.print(t.val + " ");
      t = t.next;
    }
    System.out.println();

    /* 342 + 465 = 807 */
    /* 7 -> 0 -> 8 */

    System.out.println("result=======");
    t = addTwoNumbers(a1, b1);
    while (t != null) {
      System.out.print(t.val + " ");
      t = t.next;
    }
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode trace = result;
    boolean up = false;

    while (l1 != null && l2 != null) {
      int value = l1.val + l2.val + (up ? 1 : 0);
      if (value >= 10) {
        up = true;
      } else {
        up = false;
      }
      ListNode temp = new ListNode(value % 10);
      trace.next = temp;
      trace = trace.next;
      l1 = l1.next;
      l2 = l2.next;
    }

    while(l1 != null) {
      int value = l1.val + (up ? 1 : 0);
      if (value >= 10) {
        up = true;
      } else {
        up = false;
      }
      ListNode temp = new ListNode(value % 10);
      trace.next = temp;
      trace = trace.next;
      l1 = l1.next;
    }

    while(l2 != null) {
      int value = l2.val + (up ? 1 : 0);
      if (value >= 10) {
        up = true;
      } else {
        up = false;
      }
      ListNode temp = new ListNode(value % 10);
      trace.next = temp;
      trace = trace.next;
      l2 = l2.next;
    }

    if (up) {
      ListNode temp = new ListNode(1);
      trace.next = temp;
    }

    return result.next;
  }
}
