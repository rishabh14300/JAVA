package Jaxa;
class Base{
	Base(){
		System.out.println("I am a constructor.");
	}
	Base(int a){                                      // Method Overloading
		System.out.println("I am a constructor of value "+a);
	}
	
	}

class Derived extends Base{
	Derived(){
		//super(10);
		System.out.println("I am derived constructor.");
	}
	Derived(int a, int b){
		super(a);
		System.out.println("I am derived constructor."+b);
}
}
class Integrate extends Derived{
	Integrate(){
		System.out.println("Sahij(John) is a bot.");
	}
}
public class Constructor_in_inheritance {
	public static void main(String[] args) {
		//Base b = new Base();
		Derived d = new Derived(14,9);
		Integrate I = new Integrate();
	}

}
