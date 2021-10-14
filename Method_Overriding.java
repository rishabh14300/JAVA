package Jaxa;
/* If subclass(child class) has same method as declared in parent class is known as Method Overriding.
 * Method Overriding is used for runtime polymorphism. */
class A{
	int a;
	public void math() {
		System.out.println("I am in Class A");
	}
	public int math1() {
		return 4;
	}
}
class B extends A{
	int b;
	public void mai() {
		System.out.println("Its my own property");
	}
	@Override
	public void math() {
		System.out.println("I am a overrided function");
	}
}
public class Method_Overriding {
	public static void main(String[] args) {
		A a = new A();
		a.math();
	
		B b = new B();
		b.math();
	}
	
}
