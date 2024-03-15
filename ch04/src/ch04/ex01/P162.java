package ch04.ex01;

public class P162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*6) + 1;
		int num2 = (int)(Math.random()*6) + 1;
		
		int result = num1 * num2;
		
		System.out.println("곱 : " + result);
		System.out.println("1번주사위 : " + num1);
		System.out.println("2번주사위 : " + num2);
	}

}
