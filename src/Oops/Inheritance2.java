package Oops;


/*class m1{

	 private void m()
		{
			System.out.println("hfg22222222");
		}
	
}*/
public class Inheritance2 extends Inheritancefff 
{
	public int x=1;
	
	 void m1()
	{
		System.out.println("Inheritance2");
	}
	 
	/* final void m()
		{
			System.out.println("m");
		}*/
	public void test()
	{
		System.out.println("hiiiii");
	}

	public static void main(String[] args) {
		
		
		
		Inheritance2 obj1=new Inheritance2();
		Inheritancefff obj2=new Inheritance2();
		//obj1.e;
		obj1.m1();
		obj2.m1();
		
		
		
		System.out.println("Inheritance2  "+obj1.x);
	
		System.out.println("Inheritancefff  "+obj2.x);
		
	}

}
