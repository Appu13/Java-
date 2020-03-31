import java.util.Scanner;

public class methods {
	public  static void add(int x,int y) {
		int a=x,b=y;
		System.out.println("Sum "+(a+b));
	}
	public static int add() {
		Scanner sc= new Scanner(System.in);
		int a, b;
		System.out.println("Enter the first number ");
		a=sc.nextInt();
		System.out.println("Enter the next number ");
		b=sc.nextInt();
		return (a+b);
		
	}

	public static void main(String[] args) {
		// Declaration of variables to be supplied to function
		int x=2,y=3;
		int c; // variable to store returned value
		add(x,y);//calling 1st add
		c=add();//calling 2nd add
		System.out.println("Sum "+c);
		
		

	}

}
