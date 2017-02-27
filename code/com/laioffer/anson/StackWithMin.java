public class StackWithMin {
  private Deque<Pair> minStack;
	private Deque<Integer> stack;
	
	public Solution() {
		stack = new ArrayDeque<Integer>();
		minStack = new ArrayDeque<Pair>();
	}

	public int pop() {
		if (stack.isEmpty()) {
			return -1;
		}
		if (stack.size() <= minStack.peek().curSize) {
			minStack.pop();
		} 
		return stack.pop();
	}

	public void push(int element) {
		stack.push(element);
		if (minStack.isEmpty()) {
			minStack.push(new Pair(element, stack.size()));
		} else {
			Pair current = minStack.peek();
			if (current.value <= element) {
				return;
			}
			minStack.push(new Pair(element, stack.size()));
		}
	}

	public int top() {
		if (stack.isEmpty()) {
			return -1;
		}
		return stack.peek();
	}

	public int min() {
	  if (minStack.isEmpty()) {
			return -1;
		}
		return minStack.peek().value;
	}
}

class Pair {
	int value;
	int curSize;
	Pair (int e, int s) {
		value = e;
		curSize = s;
	}
}
