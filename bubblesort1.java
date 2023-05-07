public class bubblesort1
{
	public static void main(String[] args) 
	{
		int[] a={11,99,22,88,33,77,44,66,55};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
				else
				{
					break;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}

/*
11 22 33 44 55 66 77 88 99

*/