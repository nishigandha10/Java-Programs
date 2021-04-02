package String1;

public class PrintRepeatedCharInString {

	public static void main(String[] args) {
	String s="Nishigandha";
	s=s.toLowerCase();
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}

	}

}
