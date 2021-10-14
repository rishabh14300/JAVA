package Jaxa;
// If two or more same methods with different parameters is known as Method Overloading
// Method Overloading will not work if we change the return type
public class Method_Overloading {
	static void friend() {
		System.out.println("Killa meri jaan");
	}
	static void friend(String a) {
		System.out.println("John is a bot and Sandip uski crush.");
	}
	static void friend(int a) {
		System.out.println("Ankit Pubg KD : " +a);
	}
	static void friend1(String b) {
		System.out.println( "Are Bhaiya cover me tha." +b);
	}
	static void friend(float a) {
		System.out.println("Prince Pubg KD : " +a);
	}
	public static void main(String[] args) {
		friend();
		friend("a");
		friend(2);
		friend1("Raju");
	}

}
