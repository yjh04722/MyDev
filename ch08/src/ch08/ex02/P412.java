package ch08.ex02;

public class P412 {
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.run();
		
		c.fL = new KumhoTire();
		c.fR = new KumhoTire();
		
		c.run();
	}
}
