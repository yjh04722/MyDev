package ch06.ex02;

import ch06.ex02.Car;

public class P249 {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println("제조사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60;
		
		System.out.println("수정된 속도 : " + myCar.speed);
	}

}
