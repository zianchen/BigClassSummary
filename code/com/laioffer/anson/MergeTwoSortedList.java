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
  public ListNode merge(ListNode one, ListNode two) {
    if (one == null || two == null) {
	    	if (one == null && two == null) {
	    		return null;
	    	}
	    	return one == null ? two : one;
	    }
	    ListNode dummy = new ListNode(-1);
	    ListNode head = dummy;
	    while (one != null && two != null) {
	    	if (one.value <= two.value) {
	    		head.next = new ListNode(one.value);
	    		one = one.next;
	    	} else {
	    		head.next = new ListNode(two.value);
	    		two =two.next;
	    	}
    		head = head.next;
	    }
	    while (one != null) {
	    	head.next = one;
	    	head = head.next;
	    	one = one.next;
	    }
	    while (two != null) {
	    	head.next = two;
	    	head = head.next;
	    	two = two.next;
	    }
		return dummy.next;
  }
}
