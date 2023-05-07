//pair of elements assignment 	q	no18

public class pairele
{
	public static void main(String[] args) 
	{
		int[] a={11,11,22,99};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
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
11 11
11 22
11 99
22 11
22 11
22 22
22 99
99 11
99 11
99 22
99 99

*/