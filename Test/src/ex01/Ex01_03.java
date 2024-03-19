package ex01;

import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int num = 0;
		int oddSum = 0;
		int eveSum = 0;
		int sum = 0;
		
		System.out.print("0보다 큰 정수를 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= num; i++) {
			
			sum += i;
			
			if(i % 2 == 0) {
				
				eveSum += i;
				
			}else {
				
				oddSum += i;
				
			}
		}
		
		System.out.println("짝수의 합 : " + eveSum);
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("총합 : " + sum);

	}

}
