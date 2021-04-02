package String1;

public class NumberOfVowels {

	public static void main(String[] args) {
		
		String s="Nishigandha";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		int vc=0;
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vc++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("Numbers of vowel in string are "+vc);
		System.out.println("Number of consonants are "+c);
	}

}
