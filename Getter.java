package Jaxa;
class MyEmployee{
	private int id;
	private String name;
	
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
public class Getter {
	public static void main(String[] args) {
		MyEmployee John = new MyEmployee();
		John.setName("John is piro");
		System.out.println(John.getName());
	}

}