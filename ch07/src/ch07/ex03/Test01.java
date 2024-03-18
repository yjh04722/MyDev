package ch07.ex03;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자기 이름으로 몇만원을 가지고 집을 나선다.
		// 148번이라는 버스를 타고 서면을 간다.
		// 1호선을 타고 하단역을 가려한다.
		
		Student s1 = new Student("YangJeongHo", 50000);
		Student s2 = new Student("YangJeong", 10000);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("-----------------------------------------------");
		
		Bus b148 = new Bus(148);
		s1.takeBus(b148);
		s2.takeBus(b148);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(b148.toString());
		System.out.println("-----------------------------------------------");
		
		Subway line1 = new Subway(1);
		s1.takeSubway(line1);
		s2.takeSubway(line1);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(line1.toString());
		
		
	}

}
