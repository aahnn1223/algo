package array2;

public class Subset2 {
	public static int [] data = {1,2,3,4};
	public static int N = data.length; // 4
	public static void main(String[] args) {
		for(int i = 0; i < (1<<N); i++) {
			System.out.printf("%4s i = %d",Integer.toBinaryString(i),i);
			int sum = 0;
			for(int j = 0; j < N; j++) {
				if((i & 1<<j) != 0) {
					System.out.print(data[j] + " ");
					sum += data[j];
				}
			}
			System.out.println("sum = " +sum);
		}
	}
}



// i 1011 1011 1011 1011
// & 0001 0010 0100 1000 1 << j
// = 0001 0010 0000 1000  
// j    0    1    2    3