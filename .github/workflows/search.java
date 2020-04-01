import java.util.Scanner;





public class search{
	static void issort()
	{
		boolean t=true;
		
		int n;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a maximum of ten elements to be inserted into array");
		n=c.nextInt();
		try
		{
		if(n>10)	
		{
			throw new ArithmeticException("es");
		}
		}
		catch(Exception es)
		{
		  System.out.println("Enter a number less than 10");
		  
		}
		int a[]=new int[n];
		
		
		for (int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" Element");
			a[i]=c.nextInt();						
		}
		
		

		for (int i=0;i<n-1;i++) {
			if(a[i]>a[i+1])
			{
				
				t=false;
				break;
          
			}
		}
	if(t)
	{
		System.out.println("Sorted");
	}
	else
	{
		System.out.println("Not sorted");
	}
	}
public static void main(String[] args) {
	issort();
}
}
