package ch08.ex01;

public class P399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControler rc;
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(14);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
	}

}
