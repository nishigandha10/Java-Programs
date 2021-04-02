package String1;

import java.util.Scanner;

//Reverse a string without using string inbuilt function
public class reverseString {
	
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		
		
		int x=s.length();
		System.out.println("using charAt");
		for(int i=(x-1);i>=0;i--) {
			
			
			System.out.print(s.charAt(i));
			
		}
	     
		
		/*char a[]=s.toCharArray();
		System.out.println("using tochar array");
            for(int i=(a.length-1);i>=0;i--) 
            {
			
			System.out.print(a[i]);
			
		}*/
	     
		
		
		//With inbuilt function
		/*StringBuffer str=new StringBuffer(s);
		System.out.println(str.reverse());
		*/
		sc.close();
	}

}
