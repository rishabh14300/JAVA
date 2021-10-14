package Jaxa;
/* Encapsulation is Java is a mechanism of wrapping the data(variables) and code acting on the data(methods)
 * together as single unit.
 * In encapsulation the variables of a class will be hidden from other classes and can be accessed only through
 * the methods of their current class. Therefore, it is also known as Data Hiding. 
 * To achieve encapsulation 
 * --> Declare the variable of a class as Private 
 * --> Provide public setter and getter methods to modify and view variables values. */
class me{
	private int emp_id; // --> Data hiding
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}	
}
public class Encapsulation {
	public static void main(String[] args) {
		me m = new me();
		m.setEmp_id(2341);
		System.out.println("Employee id is: "+m.getEmp_id());
	}
}
