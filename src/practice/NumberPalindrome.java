package practice;

import java.util.Scanner;

public class NumberPalindrome {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int x=sc.nextInt();
		if(isPalindrome(x))
		{
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
		sc.close();
			
}
public static boolean isPalindrome(int number)
{
	int num=number;
	int reverse=0;
	while (num!=0) {
		int reminder=num%10;
		reverse=reverse*10+reminder;
		num=num/10;
		
	}
	if(num==reverse)
	{
		return true;
}
	return false;
	
}

}
