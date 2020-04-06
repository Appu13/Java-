import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class files
{
	public static void in() {
		File f= new File("hi.txt");
		try
		{
		if(f.createNewFile())
		{
			FileWriter fe=new FileWriter(f);
			String str;
			Scanner q=new Scanner(System.in);				
			System.out.println("Enter string to store");
			str=q.nextLine();
			fe.write(str);
			fe.close();
			q.close();
			
		}
	}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error occured");
		}
	}
	
	public static void out() {
		File f=new File("hi.txt");
		try {
		Scanner re=new Scanner(f);
		String da;
		System.out.println("Content of the  file: ");
			while(re.hasNextLine())
			{
				da=re.nextLine();
				System.out.println(da);
			}
			re.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file");
		}
				 
		
	}
	public static void main(String[] args) {
		in();
		out();
	}
		
}