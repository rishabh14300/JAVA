package Jaxa;
import java.util.*;
/*Given a string,S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.*/

public class StringHR30Days {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter no.");
	        int t = sc.nextInt();
	        sc.nextLine();
	        for(int m = 0; m<t;m++) {
	        String st = sc.nextLine();
	        sc.useDelimiter("\\n");
	        int N = st.length();
	        for(int i=0; i <= N-1;i++){
	            if(i%2==0) {
	                System.out.print(st.charAt(i));
	            }
	        }
	        System.out.print(" ");
	        for(int j=0; j <= N-1;j++){
	            if(j%2 !=0) {
	                System.out.print(st.charAt(j));
	            }
	        }
	        System.out.println(" ");
	    }
	        sc.close();
	}
}
