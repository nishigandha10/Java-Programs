package Oops;

public class MethodOver {

	public void m(int a)

	{
		MethodOver obj1=new MethodOver();
		obj1.m();
		System.out.println("hiiiii");
	}
	public String m()

	{
		
		System.out.println("ggjhgf");
		return null;
	}
	
	public static void main(String[] args) {
		
		MethodOver obj=new MethodOver();
		obj.m();
		obj.m(4);
		
	}

}
