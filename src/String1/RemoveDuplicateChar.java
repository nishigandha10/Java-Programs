package String1;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		
		String s1="Nishigandha";
		String s=s1.toLowerCase();
		System.out.println(s.toLowerCase());
		char [] ch=s.toCharArray();
		
		int len=ch.length;
		for(int i=0;i<len;i++)
		{
			
			for(int j=i+1;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					for(int k=j;k<len-1;k++)
					{
						
						ch[k]=ch[k+1];
					}
					//len=len-1;
					ch[len-1]=' ';
					
				}
			}
			System.out.print(" "+ ch[i]);
		}
		String sd=ch.toString();
		System.out.println(sd);
		
		

	}}
