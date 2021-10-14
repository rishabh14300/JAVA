package Jaxa;
 class Animal {
	int number = 6;
	String name = "SS";
	
	
}
class cat extends Animal{
	String voice = "Meow";
	String species = "Pussy";
	
}
public class Inheritance {
	public static void main(String[] args) {
		cat a = new cat();
		System.out.println(a.number);
		
	}

}
