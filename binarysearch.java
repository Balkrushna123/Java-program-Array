// binary search
public class binarysearch
{
	public static void main(String[] args)
	{
		int[] a={11,22,33,44,55,66,77,88,99};
		int num=77;
		int start=0;
		int end=a.length-1;

		while(start<=end)
		{
			int mid=(start+end)/2;

			if(a[mid]==num)
			{
				System.out.println("found at index:"+mid);
				break;
			}
			else if(num>a[mid])
				start=mid+1;
			else
				end=mid-1;
		}
		if(start>end)
			System.out.println("not found");
	}
}

/*

found at index:6

*/