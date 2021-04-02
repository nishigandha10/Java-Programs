package abstract1;

public class demo2 extends demo1{

	public static void main(String[] args) {
		demo2 obj=new demo2();
		obj.m1();

	}

	@Override
	void animal() {
		System.out.println("animal");
	}

}
