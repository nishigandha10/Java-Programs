package Oops;

public class Vararg {
	
	
	public void m2(int g ) {
		System.out.println(":buff");
		
		
	}
	public void m2(int...g ) {
		System.out.println(":buff");
		System.out.println(g[1]);
		
	}
	

	public static void main(String[] args) {
		Vararg obj=new Vararg();
		obj.m2(1,5);
		obj.m2(1);
	}

}
