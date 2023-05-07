public class unicpairlms
{
	public static void main(String[] args) 
	{
		int[] a={2,4,3,5,6,-2,4,7,8,9};

		int ele=7;

		mycode(a,ele);
	}
private static void mycode(int[] a,int[] ele)
{
	int originalcnt=0;
	for(int i=0;i<a.length;i++)
	{
		int samecnt=0;
		for(int j=0;j<i;j++)
		{
			if(a[i]==a[j])
			{
				samecnt++;
			}
		}
		if(samecnt==0)
			originalcnt++;
	}
	int b[]=new int[originalcnt];
	int p=0;
	for(int i=0;i<a.length;i++)
	{
		int samecnt=0;
		for(int j=0;j<i;j++)
		{
			if(a[i]==a[j])
				samecnt++;
		}
		if(samecnt==0)
			b[p++]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		for(int j=i;j<b.length;j++)
		{
			if(b[i]+b[j]==ele)
				System.out.print(b[i]+" "+b[j]);
		}
	}
}

}