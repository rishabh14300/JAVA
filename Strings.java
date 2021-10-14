package Jaxa;
//import java.util.Scanner;
// String is a sequence of characters. In java strings are immutable which means a constant and cannot be changed once created
public class Strings {
	public static void main(String[] args) {
		// String st = new String("Rishabh"); // String is a class in Java and String is immutable
		 String st = "Rishabh Bhadani";
	//	Scanner sc = new Scanner(System.in);
	//	String st = sc.next();
	//	String a = sc.nextLine();
	//	System.out.print(st);
	//	System.out.println(a);
		// Finding length of a String
	
	  int value = st.length(); 
	  System.out.println(value); // it also count the space
	  String lc = st.toLowerCase(); // changes the String in lower case
	  System.out.println(lc);
	  String uc = st.toUpperCase(); // for uppercase every letter
	  System.out.println(uc);
	  String ts = st.trim(); // it doesn't disturb the space between the words or letters
	  System.out.println(ts);
	 
	System.out.println(st.substring(6)); // It returns a new substring which starts from the specified position
	System.out.println(st.substring(5,9)); // It has both start and end point
	System.out.println(st.replace('R', 'Q')); // Replace the substring from other string
	System.out.println(st.startsWith("Q"));
	System.out.println(st.endsWith("ni"));
	System.out.println(st.charAt(5));
	System.out.println(st.indexOf("ha"));
	System.out.println(st.indexOf("i",2));
	System.out.println(st.lastIndexOf("a"));
	System.out.println(st.lastIndexOf("h",5));
	System.out.println(st.equals("Rishabh Bhadani"));
	System.out.println(st.equalsIgnoreCase("risHabH BHAdani"));
	}
	
}
