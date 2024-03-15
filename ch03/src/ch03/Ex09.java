package ch03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double val1, val2;
		
		System.out.print("첫번째수 : ");
		String num1 = sc.nextLine();
		
		System.out.println("");

		System.out.print("두번째수 : ");
		String num2 = sc.nextLine();
		
		val1 = Double.parseDouble(num1);
		val2 = Double.parseDouble(num2);
		
		
		System.out.println("----------------------");
		
		if(val2 == 0 || val2 == 0.0) {
			System.out.println("결과 : 무한대");
		}else {
			System.out.println(val1 / val2);
		}
		
	}

}
