package ch07.ex03;

public class Bus {
	// 필드
	int busNumber;
	int passenger;
	int money;
	
	// 생성자
	public Bus() {
		
	}
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 메소드
	public void take(int money) {
		this.money += money;
		passenger++;
	}

	@Override
	public String toString() {
		return "Bus [버스번호=" + busNumber + ", 승객수=" + passenger + ", 버스수입=" + money + "]";
	}
	
	
	
}
