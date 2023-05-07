// sorting array new technique with right shift

public class sortrighttshift
{
	public static void main(String[] args) 
	{
		int[] a={10,556,04,20,58255,5,7,9,4525};

		for(int i=0;i<a.length;i++)
		{
			int j=i-1;  //j start with i-1
			for(;j>=0;j--)
			{
				if(a[j]<a[i])
					break;
			}
			rightrotate(a,j+1,i);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	private static void rightrotate(int[] a,int b,int z)
	{
		int temp=a[z];
		for(int i=z;i>b;i--)
			a[i]=a[i-1];
			a[b]=temp;
	}
}

/*
4 5 7 9 10 20 556 4525 58255

*/

