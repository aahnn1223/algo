package array1;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args) {
		int [] data = {0,4,1,3,1,2,4,1};
		int [] temp = new int[data.length];
		int max = 0;

		for(int i = 0; i < data.length; i++) max = max < data[i] ? data[i] : max;
		
		
		int [] cnt = new int[max+1];

		for(int i = 0; i < data.length;i++) cnt[data[i]]++; 
		
		for(int i = 1; i < cnt.length;i++)	cnt[i] = cnt[i-1] + cnt[i];
		
//		for(int i = 1; i <= data.length;i++) {
//			cnt[data[data.length-i]]--;
//			temp[cnt[data[data.length-i]]] = data[data.length-i];		
//		}
		for(int i = data.length-1; i >= 0;i--) {
			cnt[data[i]]--;
			temp[cnt[data[i]]] = data[i];
		}
		
		

		System.out.println(Arrays.toString(cnt));
		System.out.println(Arrays.toString(temp));
	}
}
