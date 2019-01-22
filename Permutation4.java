package array1;

import java.io.FileInputStream;
import java.util.*;


public class Permutation4 {
	static int N,data[], caseCount;
	static int [] check = new int[7];
	public static void main(String [] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 주사위 횟수
		data = new int[N];
		data[0] = 1;
		dice(1);
		System.out.println(caseCount);
		sc.close();
	}
	
	public static void dice(int count) {
		if(count == N) {
			caseCount++;
			System.out.println(Arrays.toString(data));
			return;
		}
		for(int i = 1; i <= 6; i++) {
			data[count] = i;			
			dice(count+1);			
		}
	}
}