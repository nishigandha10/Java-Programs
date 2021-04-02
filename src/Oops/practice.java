package Oops;

public class practice {
	
	int x;
	final static int a;
	static
	{
		a=45;
	}
	public   void m1()
	{
		x=89;
		
		System.out.println("tewryj");
		//System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		practice obj=new practice();
		System.out.println(obj.a);
		
		System.out.println(obj.x);
		
		obj.m1();
	}
	

}
