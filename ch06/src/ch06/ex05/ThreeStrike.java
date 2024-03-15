package ch06.ex05;

import java.util.Scanner;

public class ThreeStrike {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		int count = 0;
		int strike = 0;
		int ball = 0;
		
		
		
		while(run) {
			
			if(count != 3) {
				// 배열에 값 집어 넣기
				for(int i = 0; i < arr1.length; i++) {
					int a = (int)(Math.random() * 10);
					arr1[i] = a;
				}				
				// 중복 확인 및 새 값 집어넣기
				for(int j = 0; j < arr1.length; j++) {
					for(int dup = 0; dup < j; dup ++) {
						int b = (int)(Math.random() * 10);
						if(arr1[j] == arr1[dup]) {
							
							arr1[j] = b;							
						}else {
							break;
						}
					}	
				}
				//출력
				System.out.println();
				for(int s = 0; s < arr1.length; s++) {
					System.out.print("arr[" + s + "]: " + arr1[s] + " ");
				}
				
				System.out.println();
				
				
				//값 입력 게임 시작
				for(int t = 0; t < arr2.length; t++) {
					System.out.print("값을 차례대로 입력해 주세요: ");
					arr2[t] = Integer.parseInt(sc.nextLine());
				}
				
				System.out.println("게임시작");
				
				for(int a = 0; a < arr1.length; a++) {
					for(int b = 0; b < arr1.length; b++) {
						if(arr1[a] == arr2[b]) {
							strike++;
						}else {
							ball++;
							count++;
						}
						
						System.out.println("Strike : " + strike + " ball : " + ball);
					}
				}	
				
			}else {
				run = false;
			}
		}
	}
}
