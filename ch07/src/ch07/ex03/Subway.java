package ch07.ex03;

public class Subway {
	// 필드
	int lineNumber;
	int passenger;
	int money;
	
	// 생성자
	public Subway() {
		
	}
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 메소드
	public void take(int money) {
		this.money += money;
		passenger++;
	}

	@Override
	public String toString() {
		return "Subway [호선=" + lineNumber + ", 승객수=" + passenger + ", 버스수입=" + money + "]";
	}
}
