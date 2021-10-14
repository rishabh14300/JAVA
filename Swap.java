package Jaxa;
import java.util.*;
public class Swap  {
		public static void main(String[] args) {
			int a,b,t;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of x");
			a = sc.nextInt();
			System.out.println("Enter the value of b");
			b = sc.nextInt();
			t = a;
			a = b;
			b=t;
			
			System.out.println("After Swapping "+a+" "+b);
			sc.close();
		}
		
}
