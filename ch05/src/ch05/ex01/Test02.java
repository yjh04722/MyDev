package ch05.ex01;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int c = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {	
				sum = sum + a[i][j];
				c++;
			}
		}
		
		avg = (double)sum / c;
		
		System.out.println(sum);
		System.out.println(avg);
	}

}
