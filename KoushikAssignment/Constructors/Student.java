package Constructors;

public class Student {
	String name;
	Student(){
		name="Unknown";
	}
	Student(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Midhun");
		System.out.println(s1.getName());
		Student s2=new Student();
		System.out.println(s2.getName());
		Student s3=new Student("Teja");
		System.out.println(s3.getName());

	}

}
