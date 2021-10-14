package Jaxa;

public class Solution {
	public static void main(String[] args) {
		long n = 42;
		long res = 1;
		for(long i =1; i<=n; i++) {
			res= res*i;
		}
		System.out.println(res);
		res=(long)Math.log10(res)+1;
		System.out.println(res);
	}
}
