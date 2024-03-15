package ch03;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		
		int pencilPerStudent = pencils / students;
		
		System.out.println("학생 1명이 가지는 연필 개수 : " + pencilPerStudent);
		
		
		int aa = pencils % students;
		System.out.println("남은 연필 개수 : " + aa);
	}

}
