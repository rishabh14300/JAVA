package Jaxa;

public class VarArgsexample {
	static int sum(int ...arr) {
		int result = 0;
		for(int a : arr) {
			result += a;
			 result  = result/arr.length;
		}
		return result;	
	}
	public static void main(String[] args) {
		System.out.println(+sum(2,4,3));
	}
}
