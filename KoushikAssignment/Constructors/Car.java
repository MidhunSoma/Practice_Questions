package Constructors;

public class Car {
	String brand;
	Car(){
		brand="Ford";
	}
	public String getbrand() {
		return brand;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		String b=c.getbrand();
		System.out.println("Brand :"+b);
	}

}
