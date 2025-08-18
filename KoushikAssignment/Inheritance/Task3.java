package Inheritance;
class Animal{
	Animal(int i){
		System.out.println("Bark");
	}
}
class Dog extends Animal{
	Dog(){
		super(1);
	}
    void bark(){
        System.out.println("Subclass");
    }
}

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d =new Dog();
		d.bark();

	}

}
