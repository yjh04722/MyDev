package ex01;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);

		String name = "홍길동";
		String job = "프로그래머";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}