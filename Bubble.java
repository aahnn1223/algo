package array1;

import java.util.*;

public class Bubble {

	public static void main(String[] args) {
		int [] data = {55,78,7,12,42};
		int tmp = 0;
		System.out.println(Arrays.toString(data));
		System.out.println();
		for(int i = data.length-1; i >= 0;i--) {
			for(int j = 0;j < i;j++) {
				if(data[j] > data[j+1]) {
					tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
				System.out.println(Arrays.toString(data));
			}
			System.out.println();
		}
	}
}
