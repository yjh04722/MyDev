package ch04.ex01;

import java.util.Scanner;

public class P175 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		String num1 = sc.nextLine();
		
		int num = Integer.parseInt(num1);
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= 9; j++) {
				
				System.out.printf("%d * %d = \t%d", i, j, i * j);
				System.out.println("");

			}
			
			System.out.println("");
			
		}
		
	}

}
