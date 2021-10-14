package Jaxa;
import java.util.*;

// A function in java can call itself . Such function is known as Recursion function.
public class Recursion {
	public int factorial(int x) {
		if(x==0 || x==1) {
			return 1;
		}
		else {
			return x*factorial(x-1);
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		n = sc.nextInt();
		Recursion R = new Recursion();
	
		System.out.println("The factorial of the number is "+R.factorial(n));
		sc.close();
	}
}
