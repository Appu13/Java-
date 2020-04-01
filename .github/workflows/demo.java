
interface demo1{
	//the first interface
	public void sdemo1(); 
}
 interface demo2{
	 //the second interface
	 public void sdemo2(); 
	
 }
class how implements demo1,demo2{
  //class to implement the interface
	
	public void sdemo1() {
	System.out.println("The first interface");
	}
   public void sdemo2() {
	  System.out.println("The second interface");
	
}	 
	 
 }

public class demo {

	public static void main(String[] args) {
	
	how c=new how();
	c.sdemo1();
	c.sdemo2();
	}
}