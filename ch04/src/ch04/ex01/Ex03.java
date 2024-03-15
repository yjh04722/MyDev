package ch04.ex01;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		while( true ) {
			
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			
			int result = num1 + num2;
			
			System.out.println("(" + num1 + "," + num2 + ")");
			
			if( result == 5 ) {
				break;
			}
		}
	}

}
