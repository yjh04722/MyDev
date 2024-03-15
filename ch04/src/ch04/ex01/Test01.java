package ch04.ex01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오.");
		String num1 = sc.nextLine();
		
		System.out.print("두번째 숫자를 입력하시오.");
		String num2 = sc.nextLine();
		
		double num1_chg = Double.parseDouble(num1);
		double num2_chg = Double.parseDouble(num2);
		
		System.out.println(num1_chg + "+" + num2_chg + "=" + (num1_chg + num2_chg));
		System.out.println(num1_chg + "-" + num2_chg + "=" + (num1_chg - num2_chg));
		System.out.println(num1_chg + "x" + num2_chg + "=" + (num1_chg * num2_chg));
		
		if(num2_chg == 0 && num2_chg == 0.0) {
			System.out.println("0으로 나눌 수 없습니다.");			
		}else {
			System.out.println(num1_chg + "/" + num2_chg + "=" + (num1_chg / num2_chg));
		}
		
	}

}
