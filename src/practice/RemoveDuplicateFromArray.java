package practice;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,1,2,7};
		int len=a.length;
		int temp;
		for(int i=0;i<len;i++)
		{
			temp=a[i];
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j;k<len-1;k++)
					{
						
						a[k]=a[k+1];
					}
					//len=len-1;
					a[len-1]=-1;
					
				}
			}
			System.out.print(" "+ a[i]);
		}
		
		
	}

}
