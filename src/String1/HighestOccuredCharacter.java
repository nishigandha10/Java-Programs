package String1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class HighestOccuredCharacter {

	public static void main(String[] args) {
		
		
		String s="Nishigandha";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		
		
		HashMap<Character, Integer> mp=new HashMap<>();
		for (char c : ch) {
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c)+1);
			}
			else
			{
				mp.put(c, 1);
			}
			
		}
		for (Entry<Character, Integer> d : mp.entrySet()) {
			if(d.getValue()>1) {
				
			
			System.out.println(d.getKey()+"  "+d.getValue());
			}
		
		}
	}

}
