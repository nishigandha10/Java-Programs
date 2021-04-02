package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		
		
ArrayList<Integer> list=new ArrayList<>();
		
		list.add(15);
		list.add(11);
		list.add(11);
		list.add(10);
		list.add(11);
		
		Object[] a=list.toArray();
		ArrayList<String> games = new ArrayList<String>(10);
        games.add("Cricket");
        games.add("Hockey");
        games.add("Chess");
        
        Object[] m=games.toArray();
        
        String []w=Arrays.copyOf(m, m.length,String[].class);
        
        System.out.println("Array");
        for (String string : w) {
        	System.out.print(string+" ");
        	
        	
			
		}
	}

}
