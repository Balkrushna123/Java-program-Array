//find maximum number in array list
public class maximum
{
	public static void main(String[] args) 
	{
		int[] a={10,20,100,300,2,500};

		int max=Integer.MIN_VALUE;//this function is inbuilt in java
			
			//OR

		//int max=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) //compare number one by one 
			{
				max=a[i];
			}
		}
		System.out.println("maximum number is:"+max);
		
	}
}

/*
maximum number is:500

*/