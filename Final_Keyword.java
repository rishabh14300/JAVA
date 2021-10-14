package Jaxa;
// we use final keyword when we want to keep a variable constant (Variable)
// we don't want method overriding then we use final keyword (Method)
// when we don't want inheritance of a class then we use final keyword (Class)

final class Demo{ // if we write final in class name then it will not allow the inheritance property
	final void v() {
		System.out.println("I am in demo class");
	}
}
// class Test extends Demo{
	// void v() { This will throw error because final keyword doesn't allow overriding
	//	System.out.println("I am in test class");
	//} Compile time error dega 
// }
public class Final_Keyword {
	public static void main(String[] args) {
		//final int i = 29; // final will not change the value of i in next steps
		// i = i + 10; This will throw an error because final keyword made the value of i is constant
		//System.out.println(i);
		// we use in variables like pi, g etc
		 Demo d = new Demo();
		 d.v();
		 
		// Test t = new Test();
		// t.v();
	}
}


