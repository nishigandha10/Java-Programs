package practice;

import java.util.Scanner;

public class swaptwonumber {
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before swapping  "+"x="+x+"  y="+y);
		
		/*int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping  "+"x="+x+"  y="+y);
		*/
		
		//without using third variable
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping  "+"x="+x+"  y="+y);
	}
}
