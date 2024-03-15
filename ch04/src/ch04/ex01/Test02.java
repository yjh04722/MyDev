package ch04.ex01;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println((num / 10) * 10 + 1);

	}

}
