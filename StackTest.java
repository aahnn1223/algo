package stack1;

import java.util.Stack;

public class StackTest {
	public static int[] stack = new int[1000];
	public static int top = -1;
	
	public static boolean push(int value) {
		if(top >= stack.length) return false;
		stack[++top] =value;
		return true;
	}
	public static int pop() {
		if(top == -1) return -1;
		int value = stack[top--];
		return value;
	}
	
	
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println();
		
		Stack<String> s = new Stack<>();
		s.push("A A A");
		s.push("B B");
		s.push("C");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
