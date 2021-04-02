package String1;

import java.util.Scanner;

public class TwoStringAnagram {

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String s1=sc.next();
		System.out.println("Enter Second String");
		String s2=sc.next();
		int len1=s1.length();
		//int len2=s2.length();
		int cnt=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<len1;i++)
			{
				for(int j=0;j<len1;j++)
				{
				if(s1.charAt(i)==s2.charAt(j))
				{
					cnt++;
					break;
				}
			}}
			System.out.println("Count="+cnt);
			if(cnt==len1)
			{
				System.out.println("String are Anagrams");
			}
			
		}
		else
		{
			System.out.println("Two String Are not Anagram");
		}
	
		
		
		
	}

}
