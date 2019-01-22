package array1;

public class Permutation {

	public static void main(String[] args) {
		int [] data  = {1,2,3};
		
		int cnt = 0;
		for(int i1=1;i1<=3;i1++) {
			for(int i2=1;i2<=3;i2++) {
				for(int i3=1;i3<=3;i3++) {
					if(i1 == i2 || i2 == i3 || i3 == i1)
						continue;
					System.out.println(i1+ " " +i2+ " "+i3);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
