package String1;

import java.util.Scanner;

public class TotalNumberOfCharInString {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter String");
		String str=s1.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total number charater in string = "+count
				);
	s1.close();}

}
