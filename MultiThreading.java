package Jaxa;
// using extends thread class
class Mythread extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i>=0) {
		System.out.println("I am a threaded class.");
		System.out.println("I am happy because I have learnt Java easily.");
		i++;
		}
	}
}
class Mythread2 extends Thread{
	@Override
	public void run() {
		int j=0;
		while(j>=0) {
			System.out.println("I am multithreading this task");
			System.out.println("I am Happy.");
			j++;
		}
		
	}
}
public class MultiThreading {
	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		Mythread2 t2 = new Mythread2();
		t1.start();
		t2.start(); // we don't have to call run method because start automatically calls the run method
		
	}

}
