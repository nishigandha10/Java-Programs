package String1;

public class SubString {

	public static void main(String[] args) {
	
	
	String s="nishigandha";
	String str="gan";
	String st=null;
	int temp=0;
	for(int i=0; i<s.length();i++)
	{
		for(int j=i+2;j<=s.length();j++)
		{
			st=s.substring(i, j);
			System.out.println(st);
			if(st.equalsIgnoreCase(str))
			{
				System.out.println("hfgjhg");
			}
		
		}
	}
	}

}
