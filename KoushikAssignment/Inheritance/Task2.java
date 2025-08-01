package Inheritance;
class Emp_Details{
	String ename;
	int eid;
	float pf;
	float bonus;
	int exp;
	/*Emp_Details(String ename,int eid,float pf,float bonus){
		this.ename=ename;
		this.eid=eid;
		this.pf=pf;
		this.bonus=bonus;
		
	}*/
	
}
class Salary extends Emp_Details{ 
	double sal;
	public void sal(String ename,int eid,float pf,float bonus,int exp) {
		sal=20000-pf+(bonus*exp);
		System.out.println("Name: "+ename);
		System.out.println("Eid: "+eid);
		System.out.println("Salary: "+sal);
	}
	
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s=new Salary();
		s.sal("Midhun",48,3000,2000,3);

	}

}
