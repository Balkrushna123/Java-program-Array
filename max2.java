//find maximum number and 2nd maximum number
public class max2
{
	public static void main(String[] args) 
	{
		int[] a={452,475,862,925,42,4};

		int max=Integer.MIN_VALUE;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int max2=Integer.MIN_VALUE;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max2 && a[i]!=max)
			{
				max2=a[i];
			}
		}
		System.out.println("1st maximum number of array list is:"+max);
		System.out.println("2nd maximum number of array list is:"+max2);
		
	}
}

/*

1st maximum number of array list is:925
2nd maximum number of array list is:862

*/