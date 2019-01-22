package array1;
import java.util.*;


public class Permutation1 {
	public static int n, data[], caseCount;
	
	public static void permutation(int count) {
		if(count == n) {
			caseCount++;
			System.out.println(Arrays.toString(data));
			return;
		}
		for(int i = 1; i < n; i++) {
			data[count] = i;
			permutation(count+1);
		}
	}
	
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		n = 3; // sc.nextInt();
		data = new int[n];
		int [][] ia = new int[7][];
		//java는 1차원배열의 1차원배열이 2차원 배열이다.
		//c에서는 int[][7] 이처럼 뒤에가 반드시 선언되어야 함.
		int[] ib = {1,2,3,4,5,6,7};
		//for(int n:ib) System.out.println(n);// for each구문
		//for(int[] a:ia)System.out.println(Arrays.toString(a));
		// 2차원 배열 한눈에 보기
		permutation(0);
		System.out.println(caseCount);
		sc.close();
	}	
}
