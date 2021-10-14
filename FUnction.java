package Jaxa;
// In Java function is known as Methods 
// To make function we have to use static keyword 
// In Java methods are used to perform some specific tasks
// It is a collection of instructions
/* It is used to achieve the reusability of code 
 * It also provides the easy modification and readability of code
 * The most important method in java is main() method  */
public class FUnction {
 int base() {  // Instance method
		int a = 10,b = 10;
		int c = a+b;
		return c;
	}
 int ji(int a,int b) {       // Instance method -- because it has not static keyword
	 int c = a-b;
	 return c;
 }
	static void is() {     // we have not to create object in static methods 
		System.out.println("HI");
	}
	static void easy() {
		System.out.println("Hi I am Learning Methods in Java");
	}
	static double ok() {
		double a=10.1,b=4.7;
		double c = a+b;
		return c;
	}
	int you() {
		int a=12;
		return a;
	}
	public static void main(String[] args) {
		FUnction b = new FUnction();
		System.out.println("The sum is: "+b.base()); // If we are creating a instance method 
		// then we to create its object and call its method using object variable
		System.out.println("The difference is: "+b.ji(78,76));
		easy();
		System.out.println(ok());
		is();
		System.out.println("no."+b.you());
	}
}
