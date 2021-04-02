package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<>();
		
		list.add("11");
		list.add("N");
		list.add("jhjdg");
		
		System.out.println("Before Reverse="+list);
		
		Collections.reverse(list);
		System.out.println("After Reverse="+list);
	}

}
