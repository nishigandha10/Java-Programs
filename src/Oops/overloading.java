package Oops;

public class overloading {
	
	
public void m2(String s) {
	System.out.println("string");
		
	}
	
	
	
	public void m2(StringBuffer g) {
		System.out.println(":buff");
		System.out.println(g);
	}
	
	

	public static void main(String[] args) {
		
		overloading obj=new overloading();
		/*obj.m1(new Object());
		obj.m1(9);*/
		
		obj.m2("hg");
		obj.m2(new StringBuffer("gh"));
		//obj.m2(null);
		
		
	}

}
