package array1;

public class Sum {
	// public static int N = 100;
	public static void main(String[] args) {
		System.out.println(sum(10));		
		System.out.println(sumR(10));
		System.out.println(fivo(10));
		System.out.println(gcd1(4,6));
		System.out.println(gcd2(4,6));
		System.out.println(gcd3(4,6));
	}
	
	public static int gcd1(int x, int y) { // 반복문
		if(x<y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		while( y != 0) {
			int n = x % y;
			x = y;
			y = n;
		}
		return x;
	}
	
	public static int gcd2(int x, int y) { // recursive
		if( x % y == 0)
			return y;
		else
			return gcd2(y, x % y);
	}
	
	public static int gcd3(int x, int y) { // 3항
		return (x % y == 0 ? y : gcd3(y, x%y));
	}
	
	
	public static int sumR(int n) {
		if(n==1)
			return n;
		return n+sumR(n-1);		
	}
	
	public static int fivo(int n) {
		if(n==1)
			return 1;
		if(n==0)
			return 0;
		return n+fivo(n-1);		
	}
	
	
	public static int sum(int N) {
		int sum = 0;
		for(int i = 1 ; i <= N; i++) {
			sum += i;
		}
		return sum;		
	}
}
