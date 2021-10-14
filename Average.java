package Jaxa;
import java.util.*;
public class Average {
	public static void main(String[] args) {
		int a,b,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		avg = (a+b)/2;
		int res = avg/2;
		System.out.println("The avg of these two numbers are: "+avg);
		System.out.println(+res);
		sc.close();
	}
	
}
