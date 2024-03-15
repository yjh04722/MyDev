package ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수 :");
		String strNum1 = sc.nextLine();
		
		System.out.println("두 번째 수 :");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		
		System.out.println("덧셈 결과 : " + result);
	
	}

}
