package Jaxa;
// Multi-threading using implements Runnable
class MythreadRun implements Runnable{
	public void run() {
		System.out.println("I am a thread 1.");
	}
}
class MythreadRunnable implements Runnable{
	public void run() {
		System.out.println("I am thread 2");
	}
}
public class MultiThreadRun {
	public static void main(String[] args) {
		MythreadRun bullet = new MythreadRun();
		Thread gun = new Thread(bullet); // We have to make thread object for running the runnable class
		MythreadRunnable bullet1 = new MythreadRunnable();
		Thread gun1 = new Thread(bullet1);
		
		gun.start();
		gun1.start();
	}
}
