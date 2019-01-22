package stack2;

public class Infix2Postfix {
	public static String s = "(6+5*(2-8)/2)";
	public static char [] stack = new char[100];
	public static int top = -1;
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if('0' <= c && c<='9') {
				sb.append(c);
			}
			else if(c==')') {
				char t = ' '; // \0000; unicode에서 null
				while((t=stack[top--]) != '('){
					sb.append(t);
				}
			}
			else {
				while(getIcp(c) <= getIsp()) {
					char t = stack[top--]; // pop()
					sb.append(t);
				}
				stack[++top] = c;
			}
		}
		System.out.println(sb);
	}
	public static int getIcp(char c) {
		switch(c) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '(':
				return 3;
		}
		return 0;
	}
	
	public static int getIsp() { // top에 있는 연산자들의 우선순위를 출력해주는 것.
		char c = (top == -1) ? '(' : stack[top]; // peek()
		switch(c) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '(':
				return 0;
		}
		return 0;
	}
}
