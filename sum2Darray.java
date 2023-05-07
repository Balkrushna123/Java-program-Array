//sum of 2D array

public class sum2Darray
{
	public static void main(String[] args) 
	{
		int[][] a={
			{1,2,4,4,2,1,6},
			{4,2,1,5,6,7,8},
			{1,4,9,8,5,6,5}};

			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					sum=sum+a[i][j];
				}
			}
			System.out.println("addition of 2D array is:"+sum);
	}
}

/*

addition of 2D array is:91

*/