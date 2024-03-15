package ch06.ex04;

public class P279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		
		c.setGas(5);
		
		boolean gasState = c.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			c.run();
		}
		
		if(c.isLeftGas()) { 
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
