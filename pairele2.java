//second scenario

public class pairele2
{
	public static void main(String[] args) 
	{
		int[] a={11,11,22,99};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}
		
	}
}

/*

11 11
11 11
11 22
11 99
11 11
11 22
11 99
22 22
22 99
99 99

*/

//Note this method remove double piar