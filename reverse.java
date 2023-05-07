//reverse array and print

public class reverse
{
	public static void main(String[] args) 
	{
		int[] a={5,10,15,20,25,30};

		int i=0;
		int j=a.length-1;
		while(i<j)  //use swapping to reverse array and print 
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}

/*

30 25 20 15 10 5

*/