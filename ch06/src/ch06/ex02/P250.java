package ch06.ex02;

import java.util.Arrays;

public class P250 {
	
	byte b;
	short s;
	int i;
	long l;
	
	boolean boo;
	char c;
	
	float f;
	double d;
	
	int[] arr;
	String str;
	
	

	@Override
	public String toString() {
		return "P250 [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", boo=" + boo + ", c=" + c + ", f=" + f + ", d="
				+ d + ", arr=" + Arrays.toString(arr) + ", str=" + str + "]";
	}



	public static void main(String[] args) {

		P250 p = new P250();
		
		System.out.println(p.toString());
		
	}

}
