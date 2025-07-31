package Constructors;
class Clock{
	int hours;
	int minutes;
	int seconds;
	Clock(){
		hours=12;
		minutes=0;
		seconds=0;
	}
	Clock(int h,int m,int s){
		hours=h;
		minutes=m;
		seconds=s;
	}
	Clock(int totalSeconds){
		hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = totalSeconds % 60;
	}
	public void getHours() {
		if(hours>0) {
			if(hours>24) {
				int h=hours-24;
				hours=h;
				
			}
		}
	}
	public void display() {
		System.out.println(hours+" : "+minutes+" : "+seconds);
	}
}

public class ClockDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c=new Clock(30,12,22);
		c.getHours();
		c.display();
	}

}
