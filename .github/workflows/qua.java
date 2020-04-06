import java.util.Scanner;
import java.lang.Math;


public class qua {
	public static void in() {
		// methhod to input the values
		Scanner q= new Scanner(System.in);
		double a,b,c;
		//receiving values
		System.out.println("Enter the coefficent of x-square");
		a=q.nextDouble();
		System.out.println("Enter the coefficent of x");
		b=q.nextDouble();
		System.out.println("Enter the constant");
		c=q.nextDouble();
		cal(a,b,c);// calling cal method by suppling values 
		q.close();		
	}
	public static void cal(double a, double b,double c) {
		// method to call and display value
		
		double s=(Math.pow(b, 2)-(4*a*c));
		double x,y;
		if(s>0)
		{
			System.out.println("Two real roots exsist");
		    s=Math.sqrt(s);
		    x=((-b)+s)/(2*a);
		    y=((-b)-s)/(2*a);
		    System.out.println(x);
		    System.out.println(y);
		    
		}
		if(s==0)
		{
			System.out.println("Only one root exsist");
			x=-(b/(2*a));
			System.out.print(x+" "+x);
		}
		if(s<0)
		{
			System.out.println("The equation has imaginary roots");
		}
		
		
	}

	public static void main(String[] args) {
		in();


	}

}
