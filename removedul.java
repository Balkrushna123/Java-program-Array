//Remove duplicate element in array

public class removedul
{
	public static void main(String[] args) 
	{
		int[] a={10,10,10,20,30,40,50,30,60};

		int[] b=removeduplicate(a);

		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}
		private static int[] removeduplicate(int[] a)
		{
			//find original count
			int originalcount=0;

			for(int i=0;i<a.length;i++)
			{
				int similarcount=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						similarcount++;
					}
				}
				if(similarcount==0)
				{
					originalcount++;
				}
			}
			int [] org=new int[originalcount];
			int p=0;

			for(int i=0;i<a.length;i++)
			{
				int similarcount=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						similarcount++;
					}
				}
		          if(similarcount==0)
		           {
		         	org[p]=a[i];
		            	p++;
		   		   }
		    }
		    return org;
	}
}

/*

10 20 40 50 30 60

*/