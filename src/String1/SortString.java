package String1;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		
		 
		
			String s="hfgfgjkgfjhg gsdfh gygsfhg";
			String[] dd=s.split(" ");
			method(dd);
			System.out.println(dd[0]);
		}
		
		
	 
	static void method(String b[])
	{
		String temp=null;
		for(int i=0;i<b.length-1;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i].length()>b[j].length())
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
					
				}
				
			}
		}
	}
	
}
