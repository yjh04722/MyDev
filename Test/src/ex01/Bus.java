package ex01;

public class Bus {
	String city;
	int num;
	int speed;
	
	public void speedUp() {
		this.city = city;
		this.num = num;
		this.speed = 10;
	}
	
	public void speedDown() {
		this.city = city;
		this.num = num;
		this.speed = 0;
	}

	
	public String show() {
		return "Bus [city=" + city + ", num=" + num + ", speed=" + speed + "]";
	}

}
