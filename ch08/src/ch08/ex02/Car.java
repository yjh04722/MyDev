package ch08.ex02;

public class Car {
	Tire fL = new HankookTire();
	Tire fR = new HankookTire();
	Tire bL = new HankookTire();
	Tire bR = new HankookTire();
	
	void run() {
		fL.roll();
		fR.roll();
		bL.roll();
		bR.roll();
	}

}
