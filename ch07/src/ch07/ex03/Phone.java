package ch07.ex03;

public abstract class Phone {
	
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("전원 On");
	}
	
	public void turnOff() {
		System.out.println("전원 Off");
	}

	abstract void sound();
}
