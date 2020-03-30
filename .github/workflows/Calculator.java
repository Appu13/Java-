import java.io.IOException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Declaration of variables
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		

		do {                               // menu design
			System.out.println("Menu\n");
			System.out.println("!)ADDITION\n2)SUBTRACTION\n3)MULTIPLICATION\n4)DIVISION\n5)EXIT");
			System.out.println("Enter your option:\n");
			c=sc.nextInt();
			if(c!=5)   //Exit condition
			{
				System.out.println("Enter the operand a");  //Getting 1st input
				a=sc.nextInt();

				System.out.println("Enter the operand b"); //Getting 2nd input
				b=sc.nextInt();
			
				switch (c) {     // Switch case to choose correct option
						
						   case 1:System.out.println("Sum ="+(a+b));  //Option to add
					   	   break;
			
			               case 2:System.out.println("Difference ="+(a-b));//Option Subtract
				           break;
		
			               case 3:System.out.println("Product ="+(a*b));//Option to multiply
			               break;
			               
			               case 4:System.out.println("Qutioent ="+(a/b));//Option to divide
                           break;
					
			               default: System.out.println("Enter the correct option");//Error message
				           break;
			} // End of switch
		}// End of if statement 
		else {
				System.out.println("Thank u for using");
				break;
			} //Exit condition
	} while (true);
		
	}//End of main

}// End of class
