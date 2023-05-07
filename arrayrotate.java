//rotate left array

public class arrayrotate
{
	public static void main(String[] args) 
	{
		int [] a={11,22,33,44,55,66};

		int temp=a[0]; //original value copy in temp a[0]

		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];

		}
		a[a.length-1]=temp; //rotate left shift

	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}

/*

22 33 44 55 66 11

*/