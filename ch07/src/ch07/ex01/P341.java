package ch07.ex01;

public class P341 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Cal c1 = new Cal();
		System.out.println("원면적: " + c1.areaCircle(r));
		System.out.println();
		
		Cal c2 = new Com();
		System.out.println("원면적: " + c2.areaCircle(r));
		System.out.println();
		
		Com c3 = new Com();
		System.out.println("원면적: " + c3.areaCircle(r));
		System.out.println();

		Cal c4 = new Com22();
		System.out.println("원면적: " + c4.areaCircle(r));
		
		
		// method는 override했다면 생성자가 누구냐에 따라 결과가 바뀜

	}

}
