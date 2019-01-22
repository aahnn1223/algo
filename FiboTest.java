package stack1;

public class FiboTest {
	public static int [] memo = new int[100];
	public int [] fibo = {0,};
	public static int Fibo(int n) {
		if(n < 2) return 1;
		else return memo[n] = Fibo(n-1) + Fibo(n-2);
	}
	public static int Fibo1(int n) {
		if(n>=2 && memo[n] ==0) {
			return memo[n] = Fibo1(n-1)+Fibo1(n-2);
		}
		return memo[n];
	}
	
	public static int Fibo2(int n) {
		for(int i = 2; i<= n;i++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		return memo[n];
	}
	
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(Fibo(40));
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"ms"+ "");
	
		
		
		start = System.nanoTime();		
		memo[0] = 0;
		memo[1] = 1;
		System.out.println(Fibo1(40));
		end = System.nanoTime();
		System.out.println(Fibo(1));
	}
}
