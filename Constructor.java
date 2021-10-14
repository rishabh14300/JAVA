package Jaxa;
// A constructor is a special type of method which is used to initialize the object
// A constructor is called when a object is created 
// It can be used to set the initial value of an object
class MyMainEmployee{
	private int id;
	private String name;
	
	public MyMainEmployee() {
		id = 45;
		name = "Rishabh Bhadani";
	} 
	public MyMainEmployee(String myName, int n) {
		id = n;
		name = myName;
	}
	
	
	public void setName(String n) {
	name= n;
	}
	public String getName() {
		return name;
	}
	public void setName(int i) {
		id = i;
	}
	public int getId() {
		return id;
	}
}
public class Constructor {
	public static void main(String[] args) {
		MyMainEmployee Rishabh = new MyMainEmployee("Rishabh",56);
		System.out.println(Rishabh.getId());
		System.out.println(Rishabh.getName());
		MyMainEmployee Killa = new MyMainEmployee();
		System.out.println(Killa.getId());
		
	}
	
}



