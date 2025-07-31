package Encapsulation;
class Rectangle{
	private double length;
	private double width;
	//double area;
	//double perimeter;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		double area=length*width;
		return area;
	}
	public double getPerimeter() {
		double perimeter=(2*(length+width));
		return perimeter;
	}
	
}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.setLength(35);
		r.setWidth(34);
		System.out.println("Area: "+r.getArea());
		System.out.println("Perimeter: "+r.getPerimeter());

	}

}
