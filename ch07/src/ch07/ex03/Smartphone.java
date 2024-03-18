package ch07.ex03;

public class Smartphone extends Phone {
	
	public Smartphone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색 합니다.");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("강제로 하는겁니다.");
	}
	
	
	
}
