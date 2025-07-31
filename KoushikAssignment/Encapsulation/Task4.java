package Encapsulation;
class LightBulb{
	private boolean isOn=false;

	public void turnOn() {
		isOn=true;
	} 
	public void turnOff() {
		isOn=false;
	}
	public boolean isOn() {
		return isOn;
		
	}
}

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LightBulb lb=new LightBulb();
		System.out.println(lb.isOn());
		lb.turnOn();
		System.out.println(lb.isOn());
		lb.turnOff();
		System.out.println(lb.isOn());

	}

}
