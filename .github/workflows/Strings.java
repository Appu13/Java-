
public class Strings {

	public static void main(String[] args) {
		// Declaration of the strings
		String fn="Appu";
		String ln="Star";
		
		// To  show string length
		System.out.println("String length of First Name "+fn.length());
	   
		// To convert string to upper case
		System.out.println("Upper case of first name "+fn.toUpperCase());
	   
		// To convert string to lower case
		System.out.println("Lower case of first name "+fn.toLowerCase());

		// To find index of a character in first name
		System.out.println("Index of u in first name "+fn.lastIndexOf('u'));
		
		// To concatenate two strings
		System.out.println("Name: "+fn+ln);
		
		  	
	}
}
