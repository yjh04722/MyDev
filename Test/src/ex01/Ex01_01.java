package ex01;

import java.util.Scanner;

public class Ex01_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		System.out.println("메뉴 : 커피, 콜라, 사이다");
		System.out.print("메뉴입력 : ");
		input = sc.nextLine();
		
		switch (input) {
		case "커피":
			
			System.out.println("2,000원");
			break;
			
		case "콜라":
			
			System.out.println("3,000원");
			break;
			
		case "사이다":
			
			System.out.println("4,000원");
			break;

		default:
			
			System.out.println("없는 메뉴입니다.");
			break;
			
		}
	}

}
