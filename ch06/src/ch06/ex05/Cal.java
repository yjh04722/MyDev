package ch06.ex05;

public class Cal {
	static double pi = 3.14;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	int plus2(int x, int y) {
		return x + y;
	}
	
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	public static void main(String[] args) {
		
		Cal c = new Cal();
		
		plus(3, 4);
		
		c.plus2(3, 4);
	}
}
