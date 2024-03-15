package ch06.ex03;

public class Car {
	//field
	String color;
	int cc;
	long a;
	
	
	// constructor
	Car(){ //overloading
 
	}
	
	Car(String color){ //overloading
		
		this.color = color;
		
	}
	
	Car(String color, int cc){ //overloading
		
		this.color = color;
		this.cc = cc;
		
	}
	
	Car(String color, long a){ //overloading
		
		this.color = color;
		this.a = a;
		
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", cc=" + cc + "]";
	}
	
	
}
