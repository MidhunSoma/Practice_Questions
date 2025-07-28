package Inheritance;
class Sal{
	double finalsalary;
	String Name;
	double sal;
	float PF;
	float Tax;
	float All;
	
	void data(String name,double salary,float pf,float tax,float allowances) {
		Name=name;
		sal=salary;
		PF=pf;
		Tax=tax;
		All=allowances;
		
	}
}
class Finsal extends Sal{
	void salary() {
		finalsalary=sal - (PF+Tax+All);
		System.out.println(Name+" : "+finalsalary);
		
	}
}

public class EmpSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finsal f=new Finsal();
		f.data("Midhun",25166,2148,5000,3500);
		f.salary();
		

	}

}
