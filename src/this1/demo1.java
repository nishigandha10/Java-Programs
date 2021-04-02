package this1;

public class demo1 {
	
	int a;
	String s;
	
	demo1(String t)
	{
		this(5);
		s=t;
		System.out.println("gdfhg");
	}
	
	demo1(int s)
	{
		a=s;
		
		
	}
	
	
	
	public void y()
	{
	System.out.println("hgjk");
		
	}	
	
	public void m()
	{
	this.y();	
		System.out.println("m");
	}	
	
	
	public static void main(String[] args) {
		
		demo1 obj=new demo1("fghfg");
		System.out.println(obj.a+"   "+obj.s);
		obj.m();
		
	}

}
