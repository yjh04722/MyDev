package ch05.ex01;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];	
				
			}else if(selectNo == 2) {
				
				if(scores != null) {
					for(int i = 0; i < scores.length; i++) {
						System.out.printf("scores[%d]> ", i);
						scores[i] = Integer.parseInt(sc.nextLine());
					}
				}else {
					System.out.println("학생수를 입력하시오..!!!!");
				}
				
			}else if(selectNo == 3) {
				
				if(scores != null) {
					for(int i = 0; i < scores.length; i++) {
						System.out.printf("scores[%d]> %d \n",i,scores[i]);
					}
				}else {
					System.out.println("학생수를 입력하시오..!!!!");
				}
				
			}else if(selectNo == 4) {
				if(scores != null) {
					int maxScore = 0;
					int sum1 = 0;
					
					for(int i = 0; i < scores.length; i++) {
						if(scores[i] > maxScore) {
								maxScore = scores[i];
						}
						
						sum1 += scores[i];
						
					}
					
					double avr = (double)sum1 / scores.length;
					
					System.out.printf("최고점수: %d \n",maxScore);
					System.out.println("평균점수: " + avr);
				}else {
					System.out.println("학생수를 입력하시오..!!!!");
				}
				
			}else if(selectNo == 5) {
				run = false;
			}		
		}
		System.out.println("프로그램 종료");
	}	
}

