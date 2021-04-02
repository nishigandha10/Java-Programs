package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveObjectFromArrayList {

	public static void main(String[] args) {
ArrayList<Integer> list=new ArrayList<>();
		
		list.add(11);
		list.add(10);
		list.add(11);
		list.add(10);
		list.add(11);
		
		System.out.print(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			int x=(int) itr.next();
			
			if(x==11)
			{
				list.remove(x);
			}
		}
		System.out.print(list);

	}

}
