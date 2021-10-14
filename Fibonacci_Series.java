package Jaxa;
// 0 1 1 2 3 5 8 13......
public class Fibonacci_Series {
	static int  n1=0,n2=1,n3=0;
	static void fibonacci(int count) {
		if(count>0) {
			n3=n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			fibonacci(count-1);
		}
	}
	public static void main(String[] args) {
		/*int n1=0,n2=1,count=12;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;++i) {
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		} */
		
		int count = 10;
		System.out.print(n1+" "+n2);
		fibonacci(count-2);
	}
}
