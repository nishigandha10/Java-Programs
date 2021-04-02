package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number up to series find");
	int x=sc.nextInt();
	int a = 1;
	int b = 0;
	int c;
	for(int i=1;i<=x;i++)
	{
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		
	}
		
	}

}
//1 1 2