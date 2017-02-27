public class QueueByTwoStack {
	private Deque<Integer> pushStack;
	private Deque<Integer> popStack;
	
	public Solution() {
		pushStack = new ArrayDeque<Integer>();
		popStack = new ArrayDeque<Integer>();
	}

	public Integer poll() {
		if (popStack.isEmpty()) {
			while (!pushStack.isEmpty()) {
				popStack.offer(pushStack.poll());
			}
		} 
		return popStack.poll();
	}

	public void offer(int element) {
		pushStack.offer(element);
	}

	public Integer peek() {
		if (popStack.isEmpty()) {
			while (!pushStack.isEmpty()) {
				popStack.offer(pushStack.poll());
			}
		} 
		return popStack.peek();
	}

	public int size() {
		if (popStack.isEmpty() && pushStack.isEmpty()) {
			return 0;
		} 
		return popStack.size() + pushStack.size();
	}

	public boolean isEmpty() {
		return popStack.isEmpty() && pushStack.isEmpty();
	}

}
