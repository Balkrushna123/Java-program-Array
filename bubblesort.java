
//bubble sort
import java.util.Arrays;
public class arrayrev123
{
	public static void main(String[] args) 
	{
		int[] a={11,99,22,88,33,77,44,66,55};

		for(int j=0;j<a.length-1;j++) //entire loop run for j condition is true
		{
			for(int i=0;i<a.length-1-j;i++)//entire loop run for one iteration for sort the element
			{
				if(a[i]>a[i+1]) //i starting with i+1
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}

/*

[11, 22, 33, 44, 55, 66, 77, 88, 99]

*/