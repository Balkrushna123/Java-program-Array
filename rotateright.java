//rotate right array

public class rotateright
{
	public static void main(String[] args) 
	{
		int [] a={11,22,33,44,55,66};

		int temp=a[a.length-1];  //int temp[0] last element of array

		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;  //rotate right shift
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*

66 11 22 33 44 55

*/