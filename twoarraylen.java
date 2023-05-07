public class twoarraylen
{
	public static void main(String[] args) 
	{
		int[] a={11,33,55};
		int[] b={22,44,66,88};
		int[] c=new int[a.length+b.length]; //find length of c array

		int j=0;
		for(int i=0;i<a.length || i<b.length;i++)  //or use c.length in for loop
		{
			if(i<a.length)  //it is execute on a.length only
			{
				c[j]=a[i];
				j++;
			}
			if(i<b.length)  //it is execute only b.length 
			{
				c[j]=b[i];
				j++;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
}

/*

11 22 33 44 55 66 88

*/