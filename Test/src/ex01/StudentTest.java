package ex01;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "유관순";
		s.age = 20;
		s.gender = "여자";
		
		Student t = new Student("홍길동",30,"남자");
		System.out.println("이름 : "+t.name);
		System.out.println("나이 : "+t.age);
		System.out.println("성별 : "+t.gender);
	}
}
