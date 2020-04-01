import java.time.LocalDateTime;
import java.util.Scanner;

import com.sun.xml.internal.messaging.saaj.soap.impl.DetailImpl;

enum std{
	first,
	second,
	third	
}

class details{
	String name;
	int rollno;
	String st;
	int k;
	public void in_d() {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter the rollno");
		rollno=s.nextInt();
		System.out.println("Enter the standard");
		k=s.nextInt();
		
	}
	public void disp() {
		System.out.println("Name: "+name);
		System.out.println("Rollnumber: "+rollno);
		System.out.println("Standard: ");
		switch(k) {
		case 1:System.out.println(std.first);
		break;
		case 2:System.out.println(std.second);
		break;
		case 3: System.out.println(std.third);
		default:System.out.println("Wrong class");
		}
		
		LocalDateTime time=LocalDateTime.now();
		System.out.println("Date of admission: "+time);
	}
}
public class student {

	public static void main(String[] args) {
	details d= new details();
	d.in_d();
	d.disp();
	}

}
