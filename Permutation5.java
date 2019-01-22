package array1;

// 순열
// line 18에서 1 -> before이 되면 조합

import java.util.Arrays;
import java.util.Scanner;

public class Permutation5 {
	public static int n, r, caseCount, data[];
	public static void permutation(int before, int flag, int count) {
		if(count == r) {
			caseCount++;
			System.out.println(Arrays.toString(data));
			return ;
		}
		for(int i = 1; i<=n ; i++) {
			if((flag & 1 << i ) ==0){
				data[count] = i;
				permutation(i+1, flag|1<<i, count+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 6;
		r = 3;
		data = new int[r];
		permutation(1,0,0);
		System.out.println(caseCount);
		sc.close();
	}
}
