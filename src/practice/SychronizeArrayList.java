package practice;

import java.util.ArrayList;
import java.util.Collections;

//import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class SychronizeArrayList {

	public SychronizeArrayList(ArrayList<String> list) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<>();
		
		list.add("11");
		list.add("N");
		list.add("jhjdg");
		
		SychronizeArrayList j=new SychronizeArrayList(list);
		
		Collections.synchronizedList(list);
	}

}
