package Jaxa;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
	int i, n, search = 0 ,arr[];
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	arr = new int[n];
	System.out.println("Enter those elements...");
	for(i =0; i<n;i++) {
		arr[i]=sc.nextInt();
		System.out.println("Enter those elements:");
		search = sc.nextInt();
	}
	for(i=0;i<n;i++) {
		if(arr[i]== search) {
			System.out.println(search+"is present at"+i+1);
		}
	}
	if(i==n) {
		System.out.println(search+"is not present");
		
		}
sc.close();
	}
	
}
