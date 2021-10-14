package Jaxa;
// object ko jo refer krta hai use Reference variable bolte hai
// this is also a reference variable
// If we create variable of same name, to resolve this problem we use this keyword
// this keyword refers to the current class reference variable

class Test{
	int i;

	/*
	 * void setValues(int x) { i = x; }  ---> different variable names so no error in the program 
	 */
	void setValues(int i) {
		this.i = i;           // here compiler gets confuse for which i he do the task so we need this keyword
	}
	// "this" refers to the object whereas instance variable also refers to object 
	// so this.i refers to instance variable 
	void show() {
		System.out.println(i);
	}
}
public class this_keyword {
	public static void main(String[] args) {
		Test t = new Test();
		t.setValues(10);
		t.show();
	
	}
}
