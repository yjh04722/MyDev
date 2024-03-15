package ch04.ex01;

public class P180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eveSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if( i % 2 == 1) {
				continue;
			}else {
				eveSum = eveSum + i;
			}		
		}

		System.out.println(eveSum);
	}
}


