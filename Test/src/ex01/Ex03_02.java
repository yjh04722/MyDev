 package ex01;

public class Ex03_02 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 100 + 1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
			sum += arr[i];
			
		}
		System.out.print(" (10회 랜덤 총합 : " + sum + ")");
	}
}
