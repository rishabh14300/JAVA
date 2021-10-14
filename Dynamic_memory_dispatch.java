package Jaxa;
class phone{
	public void ring() {
		System.out.println("Your Phone is ringing..");
	}
	public void on() {
		System.out.println("Turn on your phone");
	}
}
class Smartphone extends phone{
	public void music() {
		System.out.println("Music is playing in my Smartphone..");
	}
	public void ring() {
		System.out.println("My Smartphone is ringing...");
	}
}
public class Dynamic_memory_dispatch {
	public static void main(String[] args) {
		// phone p = new phone();                 ----> this is allowed 
		// Smartphone s  = new Smartphone();
		// p.on();
		// s.music();
		
		phone p = new Smartphone();    // ---> this is allowed because you as take super class as a reference and made object of subclass
		// Reverse is not possible
		// Smartphone s = new phone();
		p.on();
		p.ring();
	}
}
