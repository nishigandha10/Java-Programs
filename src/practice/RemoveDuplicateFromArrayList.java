package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(15);
		list.add(11);
		list.add(11);
		list.add(10);
		list.add(11);
		
		
		Set<Integer> list11=new HashSet<>(list);
		ArrayList<Integer> listwithout=new ArrayList<>(list11);
		
		System.out.println("List with duplicate"+list);
		
		System.out.println("List without duplicate"+listwithout);
	
	//Insertion order not preserved..Used Linked hashset to presenved insertiuon order
		Set<Integer> list1=new LinkedHashSet<>(list);
		ArrayList<Integer> listwithout1=new ArrayList<>(list11);
		
		System.out.println("List without duplicate Incertion order preserved"+listwithout);
		
	}

}
