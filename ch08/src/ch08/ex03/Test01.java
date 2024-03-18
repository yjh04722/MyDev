package ch08.ex03;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat();
		
		A a = c1;
		c1.method_A();
		System.out.println();
		
		B b = c1;
		c1.method_B();
		System.out.println();
		
		
		C c = c1;
		c1.method_A();
		c1.method_B();
		c1.method_C();
		System.out.println();
	}

}
