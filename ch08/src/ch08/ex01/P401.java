package ch08.ex01;

public class P401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv tv = new SmartTv();
		
		RemoteControler rc;
		Searchable sc;
		
		tv.turnOn();
		tv.setVolume(-2);
		tv.search("naver");
		tv.turnOff();
	}

}
