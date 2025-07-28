package Constructors;

public class Demo {
	int a;
	int b;
	Demo(){
		a=0;
		b=0;
	}
	Demo(int a,int b){
		this.a=a;this.b=b;
	}
	Demo(int x){
		a=x;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		System.out.println("A :"+d1.getA()+"  B :"+d1.getB());
		Demo d2=new Demo(10,13);
		System.out.println("A :"+d2.getA()+"  B :"+d2.getB());
		Demo d3=new Demo(12);
		System.out.println("A :"+d3.getA()+"  B :"+d3.getB());
		

	}

}
