/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public ListNode insert(ListNode head, int value) {
    if (head == null) {
      return new ListNode(value);
    }
    ListNode dummy = new ListNode(-1);
    ListNode prev = dummy;
    dummy.next = head;
    while (head != null && head.value < value) {
        prev = head;
        head = head.next;
    } 
    ListNode cur = new ListNode(value);
    prev.next = cur;
    cur.next = head;
    return dummy.next;
  }
}
