package ch05.ex01;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int [] a = {1, 5, 3, 8, 2};
		
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		System.out.println(max);
	}

}
