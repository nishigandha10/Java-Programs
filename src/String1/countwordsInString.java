package String1;

import java.util.HashMap;
import java.util.Scanner;

public class countwordsInString {
	
	
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println(s);
		String[] str=s.split(" ");
		System.out.println(str.length);
		
		/*int cnt=1;
		HashMap<String, Integer> map=new HashMap<>();
		for (String string : str) {
			map.put(string, cnt);
			cnt++;
			
		}
		System.out.println(map);*/
		sc.close();
	}

}
