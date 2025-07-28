package Constructors;

public class Circle {
	double radius;
	Circle(){
		radius=1;
	}
	Circle(double r){
		radius=r;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		System.out.println("Radius :"+c1.radius+"  Area :"+c1.getArea());
		Circle c2=new Circle(2.0);
		System.out.println("Radius :"+c2.radius+"  Area :"+c2.getArea());
		Circle c3=new Circle(12);
		System.out.println("Radius :"+c3.radius+"  Area :"+c3.getArea());
		Circle c4=new Circle(24);
		System.out.println("Radius :"+c4.radius+"  Area :"+c4.getArea());

	}

}
