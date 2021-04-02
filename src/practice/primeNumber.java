package practice;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int x=sc.nextInt();
		int temp;
		Boolean prime=true;
		for(int i=2;i<=x/2;i++)
		{
			temp=x%i;
			if(temp==0) {
			prime=false;
			break;
			}
		}
		if(prime) {
			System.out.println(x+"is a prime number ");
		}
		else
		System.out.println(x+"is not a prime number ");
		
	}

}
