package Jaxa;
import java.util.Scanner;
public class Exception_Handling {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b =sc.nextInt();
		try {
			int c = a/b;
			System.out.println("Answer: "+c);
		}
		
		catch(Exception e) {
			System.out.println("Can't divide by zero");
		}
		sc.close();
	}

}
