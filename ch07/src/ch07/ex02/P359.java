package ch07.ex02;

public class P359 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		
		Parent p = c;
		
		p.method1();
		p.method2();
		c.method2();
		
		System.out.println(p == c);
		System.out.println(p.equals(c));
	}

}
