package Inheritance;
class Dim{
	double area;
	void area(double l,double b) {
		area=l*b;
	}
}
class Area extends Dim{
	void print() {
		System.out.println(area);
	}
}
public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		a.area(4.5, 8.70);
		a.print();

	}

}
