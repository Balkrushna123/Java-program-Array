public class findsameelement
{
	public static void main(String[] args) 
	{	
	
	int[] a={11,22,33,44,55,55,77};

	int num=55;

	int i=0;
	for(;i<a.length;i++)
	{
		if(a[i]==num)
		{
			System.out.print("Found at index : "+i);
			break;
		}
	}
	if(i==a.length)
	{
		System.out.println("not Found");
	}
}
}

/*

Found at index : 4

*/