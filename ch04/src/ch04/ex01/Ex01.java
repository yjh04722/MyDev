package ch04.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSum = 0;
		int oddSum = 0;
		int eveSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			totalSum = totalSum + i;
			
			if( i % 2 == 0) {
				eveSum = eveSum + i;
			}else if (i % 2 == 1 ) {	
				oddSum = oddSum + i;
			}
			
		}
		
		
		System.out.println(totalSum);
		System.out.println(oddSum);
		System.out.println(eveSum);
	}

}
