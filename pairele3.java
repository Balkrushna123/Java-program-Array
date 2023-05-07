//3rd scenario
public class pairele3
{
	public static void main(String[] args) 
	{
		int[] a={11,11,22,99};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}
		
	}
}

/*

11 11
11 22
11 99
11 22
11 99
22 99

*/

//Note--this method remove same number pair