package String1;

public class OccuranceOfGivenCharaterInString {

	public static void main(String[] args) {
	
		

		String s="Nishigandha";
		s=s.toLowerCase();
		char c='n';
		int cnt=0;
	    for(int i=0;i<s.length();i++)
	    {
	    	if(s.charAt(i)==c)
	    	{
	    		cnt++;
	    	}
	    }
	    System.out.println("Number of occurance of chracter "+c+"="+cnt);
	
	}

}
