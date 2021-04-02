package Oops;

public class methodoverriding2 extends methodoverriding
{
	public void m(int a)
	{
	System.out.println(a);	
	}
	
	
	public void m1()
	{
		System.out.println("hiiiii");
	}
	
	public static void m()
	{
	System.out.println("gfxd");	
	}
	
	
	
	
	public static void main(String[] args) {
		
		
	methodoverriding2 obj=new methodoverriding2();
		
		methodoverriding obj1=new methodoverriding2();
		
		obj.m();
		obj1.m();
		
		/*obj.m1();
		obj1.m1();
		*/
		
		
		
		
		
		/*obj.m(8);
		obj1.m1();
		obj.m1();
		obj1.m1();
	*/
			
		
	}

}
