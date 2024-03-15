package ch04.ex01;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] a = {1, 2, 3};
		int max = a[0];
		int min = a[0];
		int avg = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.print("숫자를 입력하세요");
			String input = sc.nextLine();
			a[i] = Integer.parseInt(input);
			
			if(a[i] > max) {
				max = a[i];
			}else if(a[i] < min) {
				min = a[i];
			}
		}
		avg = (a[0] * a[1] * a[2]) / 3;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("평균 : " + avg);
		
		
		
		
	}

}
