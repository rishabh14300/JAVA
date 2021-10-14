package Jaxa;
// In English abstract means thought 
abstract class vehicle{
	public vehicle(){
		System.out.println("Mai Constructor hu Vehicle ka");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	abstract public void greet();
}
class Car extends vehicle{
	@Override
	public void greet() {
		System.out.println("Good morning");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		
	}
}
