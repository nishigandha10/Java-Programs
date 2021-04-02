package String1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String ss=sc.next();
		StringBuffer bs=new StringBuffer(ss);
		bs.reverse();
		if(ss.equalsIgnoreCase(bs.toString()))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("Strimg is not PAlindrome");
		}
		sc.close();
		
	}

}
