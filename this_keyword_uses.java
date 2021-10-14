package Jaxa;
// this keyword can be used to invoke current class method (implicity)
// this keyword can be used to invoke current class constructor
// this keyword can be used to pass an argument in the method call
// this keyword can be used to pass as an argument in the constructor call
class demo1{
	void display() {
		System.out.println("Hello");
	}
	void show() {
		this.display();  // display(); --> both are same because this will automatically add this keyword
	}
	// 3. use of this keyword
	
	void m1(demo1 d) { // passing parameter taking class as a reference 
		System.out.println("I am using this keyword to pass an argument in the method call ");
	}
	void m2() {
		m1(this); // now we have easily called the m1 method using this keyword
	}
}


// 2. starts from here
 
class cons{
	cons(){
		System.out.println("Kya baat hai"); // using this we can call any of the constructor 
	}
	cons(int a){
		this();
		System.out.println("Hai kuch");
	}
	cons(int a, int b){
		this(1);
		System.out.println("kuch nahi");
	}
	// 4. use of this keyword
	cons(demo1 d){
		System.out.println("Ye bhi theek hai ");
	}
}

// 5. use of this keyword 
class return1{
	return1 m1() {
		return this;
	}
}

public class this_keyword_uses {
	public static void main(String[] args) {
		demo1 d = new demo1();
		d.show();
		d.m2();
		cons c = new cons(1,2);
		return1 r = new return1();
		r.m1();
		
	}
}
