package Oops;



 class s1{
	 
	 s1()
		{
			System.out.println("1s1");
		}
	 public void m1() {
		 System.out.println("s1");
	 }
	
}
public class super1 extends s1
{
	
	super1()
	{
		System.out.println("1super1");
	}
	
 public void m1() {
	
		 System.out.println("super1");
	 }
	
	
	
	

	public static void main(String[] args) {
		
		super1 a=new super1();
		a.m1();
		
		
	}

}
 