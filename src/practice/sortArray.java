package practice;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		
		int a[]= {1,4,3,6};
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
	}
		Arrays.sort(a);
		System.out.println("After sorting");
		for(int i=a.length-1;i>=0;i--)
		{
		System.out.print(a[i]+" ");
	}
		
	}

}
