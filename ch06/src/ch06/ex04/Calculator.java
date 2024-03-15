package ch06.ex04;

public class Calculator {
	void powerOn() {
		System.out.println("전원 On");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	
	int multiply(int x, int y) {
		int result = x * y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원 Off");
	}
}
