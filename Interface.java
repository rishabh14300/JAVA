package Jaxa;
interface Bicycle{
	int a =46;
	void applyBrake(int decrement);
	void speedUp(int speed);
}
class AtlasCycle implements Bicycle{
	void blowhorn() {
		System.out.println("pee pee");
	}
	public void applyBrake(int decrement) {
		System.out.println("Brake "+decrement);
	}
	public void speedUp(int speed) {
		System.out.println("Speeeeeeeddddd "+speed+"km/hr");
	}
}
public class Interface {
	public static void main(String[] args) {
		AtlasCycle A = new AtlasCycle();
		A.applyBrake(1);
		A.blowhorn();
		A.speedUp(150);
		// System.out.println(A.a);
	}

}
