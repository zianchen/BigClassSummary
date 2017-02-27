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
	public ListNode reorder(ListNode head) {
	    if (head == null || head.next == null){
	    	return head;
	    }
	    ListNode mid = getMid(head);
	    ListNode rightHead = mid.next;
	    mid.next = null;
	    ListNode leftHead = head;
	    rightHead = reverseRecursion(rightHead);
	    ListNode dummy = new ListNode(-1);
	    ListNode newHead = dummy;
	    while (leftHead != null && rightHead != null) {
	    	newHead.next = new ListNode(leftHead.value);
	    	leftHead = leftHead.next;
	    	newHead = newHead.next;
	    	newHead.next = new ListNode(rightHead.value);
	    	rightHead = rightHead.next;
	    	newHead = newHead.next;
	    }
	    if (leftHead != null) {
	    	newHead.next = leftHead;
	    }
	    if (rightHead != null) {
	    	newHead.next = rightHead;
	    }
	    return dummy.next;
	}
	
	private ListNode reverseRecursion(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverseRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	private ListNode getMid(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
}
