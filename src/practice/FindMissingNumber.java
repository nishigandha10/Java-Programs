package practice;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		
		int [] a= {0,1,2,3,5,6,7,10};
		int cnt=10;
		int j=0;
		System.out.println("Missing Number");
		for(int i=0;i<=cnt;i++)
		{
		
			if(a[j]!=i)
			{
				System.out.print(i+" ");
			}
			else
			{
				j++;
			}
		}
		
	}

}
