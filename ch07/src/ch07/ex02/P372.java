package ch07.ex02;

public class P372 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.field1 = "data1";
		p.method1();
		p.method2();
		/*
		 * p.field2 = "data2";
 		 * p.mehtod3()
 		 * 불가능한 코드
		 */
		
		Child c = (Child)p;
		c.field2 = "yyy";
		c.method3();

	}

}
