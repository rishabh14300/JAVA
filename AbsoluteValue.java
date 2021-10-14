package Jaxa;
import java.util.*;
public class AbsoluteValue {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter any integer: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n >= 0) {
			System.out.println("The absolute value is "+n);
		}
		else {
			n = n * -1;
			System.out.println("The absolute value is:" +n);
		}
		sc.close();
	}
	
}
