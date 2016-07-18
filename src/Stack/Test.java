package Stack;

public class Test {
	public static final int LENGTH = 10;
	public static void main(String[] args) {
		Stack stack = new Stack(LENGTH);
		stack.push(4);
		stack.push(8);
		stack.push(9);
		stack.gothrough();
		stack.pop();
		stack.pop();
		stack.gothrough();
		stack.pop();
		stack.gothrough();
//		stack.pop();
	}
	static class Stack {
		private int[] stack;
		private int current = 0;
		private int length;
		public Stack(int length) {
			this.stack = new int[length];
			this.length = length;
		}
		
		public void push(int data) {
			if(current < length) {
				stack[current++] = data;
			} else {
				System.out.println("Out of range");
			}
		}
		
		public int pop() {
			if(current > 0) {
				return stack[current--];
			} else {
				System.out.println("No More Data");
				return -1;
			}
		}
		
		public void gothrough() {
			for(int i=0;i<current;i++) {
				System.out.println(stack[i] + "\n");
			}
		}
	}
}
