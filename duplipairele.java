//using duplicate method

public class duplipairele
{
	public static void main(String[] args) 
	{
		int[] a={11,11,22,99};
		a=removeDuplicate(a);

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}
		
	}
	private static int[] removeDuplicate(int[] a)
	{
		int originalcount=0;
		for(int i=0;i<a.length;i++)
		{
			int samecount=0;
			for(int j=i+1;j<a.length;i++)
			{
				if(a[i]==a[j])
					samecount++;
			}
			if(samecount==0)
				originalcount++;
		}
		int[] b=new int[originalcount];
		int p=0;
		for(int i=0;i<a.length;i++)
		{
			int samecount=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					samecount++;
				}
				if(samecount==0)
				{
					b[p]=a[i];
					p++;
				}

			}
		}
		return b;
	}
}