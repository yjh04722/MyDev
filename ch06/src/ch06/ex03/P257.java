package ch06.ex03;

public class P257 {

	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		myCar1.color = "blue";
		myCar1.cc = 2000;
		
		Car myCar2 = new Car("red");
		myCar2.cc = 1800;
		
		Car myCar3 = new Car("yellow", 4000);
		
		System.out.println(myCar1.toString());
		System.out.println(myCar2.toString());
		System.out.println(myCar3.toString());
	}

}
