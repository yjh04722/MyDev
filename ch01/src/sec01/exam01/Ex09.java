package sec01.exam01;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int result = (int)(var1 + (int)(var2 + var3) + Double.parseDouble(var4));
				
		System.out.println(result);
	}

}
