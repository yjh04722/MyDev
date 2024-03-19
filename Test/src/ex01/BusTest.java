package ex01;

public class BusTest {

	public static void main(String[] args) {
		Bus b = new Bus();		
		b.city = "부산";
		b.num = 148;
		b.speed = 0;
		
		b.speedUp();
		System.out.println( b.show() );		
		b.speedDown();
		System.out.println( b.show() );
	}

}
