package practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) 
	{
ArrayList<Integer> list=new ArrayList<>();
		
		list.add(15);
		list.add(11);
		list.add(11);
		list.add(10);
		list.add(11);
		
		Collections.sort(list);
		//Asending Order
		System.out.println("Asending"+list);
		////Desending Order
		Collections.reverse(list);
		System.out.println("Desending "+list);
	}

}
