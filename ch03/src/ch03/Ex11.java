package ch03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = sc.nextLine();
		
		System.out.print("pw : ");
		String pw = sc.nextLine();
		
		int pwd = Integer.parseInt(pw);
		
		if(id.equals("java")) {
			if(pwd == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 존재하지 않는 아이디");
		}
	}
}
