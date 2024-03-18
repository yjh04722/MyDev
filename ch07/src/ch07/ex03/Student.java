package ch07.ex03;

public class Student {
	
	String stName;
	int money;
	
	public Student() {
		
	}
	
	public Student(String stName, int money) {
		this.stName = stName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	@Override
	public String toString() {
		return "Student [학생이름=" + stName + ", 가진돈=" + money + "]";
	}
	
	
}
