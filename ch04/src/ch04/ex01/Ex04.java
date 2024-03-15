package ch04.ex01;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 60;
		
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				
				if(num == (4 * x + 5 * y)){
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}
}
