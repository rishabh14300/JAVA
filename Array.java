package Jaxa;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		
		/*int arr[]=new int[5];
		 * 
		arr[0]=10;
		arr[1]=100;
		arr[2]=910;
		arr[3]=107;
		arr[4]=170; */
		
		// 2nd method for array initialisation 
		
		// String arr[]= {"Rishabh","Sahij","Abhishek","Ankit","Raju","Prince"};
		
		// Dynamic array 
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		size=s.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Printed array: ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		
		// Multidimensional array (2D and 3D)
		s.close();
	}

}
