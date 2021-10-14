package Jaxa;

public class VarArgs {
	static int sum(int ...arr) { // it will take the integers and return it as an array
		int result = 0;
		for(int a:arr) {
			result += a;
		}
		return result;
	}
	static int subtract(int x,int ...arr) {
		int result = x;
		for(int a:arr) {
			result -=a;
		}
		return result;
	}
	static int mul(int x,int ...arr) {
		int result = x;
		for(int a:arr) {
			result *=a;
		}
		return result;
	}
	static int div(int x,int ...arr) {
		int result = x;
		for(int a:arr) {
			result /=a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("The sum of 2 and 3 is: "+sum(2,3));
		System.out.println("The difference between 3 and 2 is: "+subtract(3,2));
		System.out.println("The multiplication between 3 and 2 is: "+mul(3,2));
		System.out.println("The divison between 3 and 2 is: "+div(3,2));
	}

}
// we can also make one argument as compulsory
/*
 * static int sum(int x,int ...arr) { 
 * int result = x;
 *  for(int a:arr) {
 *   result +=x;
 * 	 }
 *   return result;
 *  }
 */
