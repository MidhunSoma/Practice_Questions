package Inheritance;
class Dimensions{
	float length;
	float width;
	Dimensions(float length,float width){
		this.length=length;
		this.width=width;
	}
}
class Recarea extends Dimensions{
	double area=0;
	Recarea(){
		super(100,20);	
	}
	public double Area() {
		area=length*width;
		return area;
	}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recarea r=new Recarea();
		System.out.println(r.Area());
	}

}
