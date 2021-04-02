package String1;

public class ShuffleOfTwoString {

	public static void main(String[] args) {
		
		
		String s1="nishi";
		String s2="gandha";
		String s3="Nishigandh";
		String s4=s3.toLowerCase();
		String s5=s1.concat(s2);
		//System.out.println(str);
		int len1=s4.length();
		int cnt=0;
		if(s4.length()==s5.length())
		{
			
			
			for(int i=0;i<len1;i++)
			{
				for(int j=0;j<len1;j++)
				{
				if(s4.charAt(i)==s5.charAt(j))
				{
					cnt++;
					break;
				}
			}}
			//System.out.println("Count="+cnt);
			if(cnt==len1)
			{
				System.out.println("String are Suffle");
			}
			
		}
		else
		{
			System.out.println("Not Suffle of two string");
		}
	}

}
