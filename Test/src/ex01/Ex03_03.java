package ex01;

import java.util.Scanner;

public class Ex03_03 {

	public static void main(String[] args) {
        int input = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원 입력 : ");
        input = Integer.parseInt(scanner.nextLine());
        System.out.println("-----------------------");
        
        Student[] students = new Student[input];
        
        for (int i = 0; i < students.length; ++i) {
            students[i] = new Student();
        }

        String name;
        int korea;
        int english;
        int math;
        
        for (int i = 0; i < input; ++i) {
            System.out.print("이름 입력 : ");
            name = scanner.nextLine();
            System.out.print("국어 점수 : ");
            korea = Integer.parseInt(scanner.nextLine());
            System.out.print("영어 점수 : ");
            english = Integer.parseInt(scanner.nextLine());
            System.out.print("수학 점수 : ");
            math = Integer.parseInt(scanner.nextLine());
            
            students[i].setStudent(name, korea, english, math);
            System.out.println("-----------------------");
        }

        //총합 구하기
        int[] avg = new int[input];
        int[] sum = new int[input];
        for (int t = 0; t < students.length; t++) {
            sum[t] = students[t].getSumStudent();
            avg[t] = students[t].getSumStudent() / 3;
        }
        
        //출력
        for(int k = 0; k < students.length; k++) {
        	System.out.println("이름 : " + students[k].name + ", 총점 : " + sum[k] + ", 평균 : " + avg[k]);
        }
    }

    public static class Student {
        String name;
        int korea;
        int english;
        int math;
        int sum;
        
        
        public void setStudent(String name, int korea, int english, int math) {
            this.name = name;
            this.korea = korea;
            this.english = english;
            this.math = math;
        }
        
        public int getSumStudent() {
        	sum = korea + english + math;
        	
        	return sum;
        }        
        
    }    
}
