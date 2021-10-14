package Jaxa;
// To inherit the interface we have the only way to inherit it in another interface
// we cannot inherit interface in a class
interface John{
	void bot();
	void lowKd();
}
interface Sahij extends John{
	double kd=2.45;
	
}
class Pubg implements Sahij{
	public void bot() {
		System.out.println("John is a bot.");
	}
	public void lowKd() {
		System.out.println("No doubt his kd is low but he is a clutch master.");
	}
	public double kd() {
		return kd;
	}
}
public class Inheritance_In_interace {
	public static void main(String[] args) {
		Pubg p = new Pubg();
		p.bot();
		p.lowKd();
		System.out.println("His KD is "+Sahij.kd);
	}
}
