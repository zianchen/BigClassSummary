package com.laioffer.anson;

public class ReverseLinkedList {

	public ListNode reverseIteration(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
	
	/*
	algorithm: somehow make head.next reversed, then the base case would be two steps,
	1. let head.next.next point to head,
	2. reverse head: which is let head.next = null
	The tricky things are,
	1. what is the base case for recursion and what is corner case? Most of the time try to think if they can be merged, otherwise we need extra check for each of them.
	2. head.next should always = null in line 34? Or something else? here the base case and general logic merged into one again. head.next should always be null.
	   Here we need to think very carefully about what exactly accomplished after calling reverseRecursion(head.next)? 
	   It only reversed all the next reference begin at head.next.next!!!, not including head.next!, example
	   1 -> [2 -> 3 -> 4] : only did 1 -> [2 <-> 3 <- 4] after calling reverseRecursion(head.next) for ListNode(2), 2 itself not reversed!!!! That's the most important part!
	*/
	public ListNode reverseRecursion(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverseRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
