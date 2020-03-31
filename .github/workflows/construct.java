
public class construct {
	
	int x,y;
	String fn,ln;

	public construct() {                 
		//default constructor
		System.out.println("Default constructor called");
		fn="Appu";
		ln="Star";
	}
	public construct(int a, int b) {
		//parameterised constructor
		System.out.println("Parameterised constructor is called");
		x=a;
		y=b;
		
	}
	public construct(construct c) {
		//copy constructor
		System.out.println("Copy constructor called");
		x=c.x;
		y=c.y;
		
		
	} 
	public static void main(String[] args) {
		construct c1= new construct(2,3);
		construct c2=new construct(c1);
		System.out.println("Attributes of first object");
		System.out.println("Name:");
		System.out.println(c1.fn+c1.ln);
		System.out.println("Integer attributes "+c1.x+c1.y);
		
		System.out.println("Attributes of second object");
		System.out.println("Name:");
		System.out.println(c2.fn+c2.ln);
		System.out.println("Integer attributes "+c2.x+c2.y);
		

       
	}

}
