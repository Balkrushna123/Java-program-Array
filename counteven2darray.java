// count of even number in 2D array
public class counteven2darray
{
	public static void main(String[] args) 
	{
		int[][] a={
			{1,2,4},
			{4,2,1,5,6,7,8},
			{1,4,9}};

			int count=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(a[i][j]%2==0)
						count++;
				}
			}
			System.out.println("even number of 2d array is:"+count);		
	}
}

/*

even number of 2d array is:7

*/