package String1;

import java.util.Arrays;

public class HighestPalindromeInString {

	public static void main(String[] args) {
	
		String s="abaaabaa";
		String str="gan";
		String st=null;
		String [] f=new  String[20];
		int temp=0;
		for(int i=0; i<s.length();i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				st=s.substring(i, j);
				StringBuffer b=new StringBuffer(st);
				b.reverse();
			if(st.equalsIgnoreCase(b.toString()))
			{
				f[temp]=st;
				temp++;
				System.out.println(st);
			}
			
			}
		}
		String g=f[0];
		for(int i=1;i<temp;i++)
		{
			//Arrays.sort(f);
			//System.out.println(f[i].length());
			int a=f[i].length();
			int b=g.length();
			
			//System.out.println("a="+a+" b="+b);
			if(a>b)
			{
				g=f[i];
				
			}
		}
		System.out.println("Highest PAlindrome="+g);
	}

}
