package ch06.ex04;

import java.util.Scanner;

public class P273 {
	public static void main(String[] args) {
		boolean run = true;
		int checkBool = 0;
		Scanner sc = new Scanner(System.in);
		Calculator cc = new Calculator();
		
		System.out.println("1.전원 On | 2. 전원 Off");
		checkBool = Integer.parseInt(sc.nextLine());
		
		if(checkBool == 1){
			cc.powerOn();
			
			int num1, num2, result;
			String menu = "";
			
			while(run) {
				System.out.print("숫자를 입력하세요: ");
				num1 = Integer.parseInt(sc.nextLine());
				
				System.out.print("숫자를 입력하세요: ");
				num2 = Integer.parseInt(sc.nextLine());
				
				System.out.println("입력한 숫자: " + num1 + "," + num2);
				System.out.println("---------------------------------------");
				System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
				System.out.println("---------------------------------------");
				System.out.println("수행할 연산을 선택하세요.");
				menu = sc.nextLine();
				
				switch (menu) {
				case "1": {
					
					System.out.print("덧셈> ");
					result = cc.plus(num1, num2);

					System.out.println("덧셈 결과 : " + result);
					
					break;
					
					}
				case "2": {
					
					System.out.print("뺄셈> ");
					result = cc.minus(num1, num2);

					System.out.println("뺼셈 결과 : " + result);
					
					break;
					
					}
				case "3": {
					
					System.out.print("곱셈> ");
					result = cc.multiply(num1, num2);

					System.out.println("곱셈 결과 : " + result);
					
					break;
					
					}
				
				case "4": {
					
					System.out.print("나눗셈> ");
					double result2 = cc.divide(num1, num2);

					System.out.println("나눗셈 결과 : " + result2);
					
					break;
					
					}
				
				default:
					run = false;
					break;
				}
				
			}
			
			cc.powerOff();
		}else {
			cc.powerOff();
		}

	}
}
