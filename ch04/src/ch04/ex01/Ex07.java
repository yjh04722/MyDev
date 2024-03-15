package ch04.ex01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int blc = 0; //잔고
		int input = 0; //입출금
		String menu;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			
			menu = sc.nextLine();
			switch (menu) {
			case "1": {
				
				System.out.print("예금액> ");
				input = Integer.parseInt(sc.nextLine());
				
				blc = blc + input;
				
				System.out.println("잔고 : " + blc);
				
				break;
				
				}
			case "2": {
				
				System.out.print("출금액> ");
				input = Integer.parseInt(sc.nextLine());
				
				blc = blc - input;
				
				System.out.println("잔고 : " + blc);
				
				break;
				
				}
			case "3": {
				
				System.out.print("예금액> ");
				
				System.out.println("잔고 : " + blc);
				
				break;
				
				}
			default:
				run = false;
				break;
			}
			
			
		}
		System.out.println("종료");
	}

}
